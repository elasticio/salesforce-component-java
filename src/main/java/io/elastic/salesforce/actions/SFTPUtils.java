package io.elastic.salesforce.actions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Vector;

import com.jcraft.jsch.*;
import com.jcraft.jsch.ChannelSftp.LsEntry;

public class SFTPUtils {

    private String hostName;
    private String hostPort;
    private String userName;
    private String passWord;
    private String destinationDir;

    // For sFTP server
    private ChannelSftp channelSftp = null;
    private Session session = null;
    private Channel channel = null;

    private int userGroupId = 0;

    public SFTPUtils() {

    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getHostPort() {
        return hostPort;
    }

    public void setHostPort(String hostPort) {
        this.hostPort = hostPort;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getDestinationDir() {
        return destinationDir;
    }

    public void setDestinationDir(String destinationDir) {
        this.destinationDir = destinationDir;
    }

    public int getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(int userGroupId) {
        this.userGroupId = userGroupId;
    }

    private void initChannelSftp() throws JSchException {
        channelSftp = null;
        session = null;

        JSch jsch = new JSch();
        //
        session = jsch.getSession(userName, hostName,
                Integer.valueOf(hostPort));
        // logger.info("get Session end");
        session.setPassword(passWord);
        java.util.Properties config = new java.util.Properties();
        config.put("StrictHostKeyChecking", "no");
        session.setConfig(config);


    }

    /*
     * Upload file to ftp server that has configuration on sysConfig.properties
     * filename: name of file that will be stored on ftp fis: input stream of
     * file that will be stored on ftp enableLog: enable log return value: URN
     */
    public String uploadFileToFTP(String filename, InputStream fis,
                                  boolean enableLog) throws JSchException, SftpException {
        String result = "";

        initChannelSftp();

        // logger.info("session connect begin");
        if (!session.isConnected())
            session.connect();
        // logger.info("session connect end");
        channel = session.openChannel("sftp");
        // logger.info("channel connect begin");
        channel.connect();
        // logger.info("channel connect end");
        channelSftp = (ChannelSftp) channel;
        try {
            channelSftp.cd(destinationDir);
            // logger.info("cd relative Dir");
        } catch (SftpException e) {
            channelSftp.mkdir(destinationDir);
            channelSftp.cd(destinationDir);
        }

        channelSftp.put(fis, filename);
        result = String.format("sftp://%s/%s/%s", hostName, destinationDir, filename);

        channelSftp.exit();
        channel.disconnect();
        session.disconnect();

        return result;
    }

    public String uploadFileToFTP(String desFileName, String srcFilePath,
                                  boolean enableLog) throws SftpException, JSchException, FileNotFoundException {
        String result = "";

        InputStream fis = new FileInputStream(srcFilePath);
        result = uploadFileToFTP(desFileName, fis, enableLog);


        return result;
    }

    public boolean checkExist(String fileName) throws JSchException, SftpException {
        boolean existed = false;

        initChannelSftp();

        if (!session.isConnected())
            session.connect();
        channel = session.openChannel("sftp");
        channel.connect();
        channelSftp = (ChannelSftp) channel;
        try {
            channelSftp.cd(destinationDir);
        } catch (SftpException e) {
            channelSftp.mkdir(destinationDir);
            channelSftp.cd(destinationDir);
        }

        Vector ls = channelSftp.ls(destinationDir);
        if (ls != null) {
            // Iterate listing.
            for (int i = 0; i < ls.size(); i++) {
                LsEntry entry = (LsEntry) ls.elementAt(i);
                String file_name = entry.getFilename();
                if (!entry.getAttrs().isDir()) {
                    if (fileName.toLowerCase().startsWith(file_name)) {
                        existed = true;
                    }
                }
            }
        }

        channelSftp.exit();
        channel.disconnect();
        session.disconnect();

        return existed;
    }

    public void deleteFile(String fileName) throws JSchException, SftpException {

        initChannelSftp();

        if (!session.isConnected())
            session.connect();
        channel = session.openChannel("sftp");
        channel.connect();
        channelSftp = (ChannelSftp) channel;
        try {
            channelSftp.cd(destinationDir);
        } catch (SftpException e) {
            channelSftp.mkdir(destinationDir);
            channelSftp.cd(destinationDir);
        }
        channelSftp.rm(fileName);
        channelSftp.exit();
        channel.disconnect();
        session.disconnect();


    }
}
