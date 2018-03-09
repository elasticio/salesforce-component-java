package io.elastic.salesforce.actions;

import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpException;
import io.elastic.api.CredentialsVerifier;
import io.elastic.api.InvalidCredentialsException;

import javax.json.JsonObject;

import static io.elastic.salesforce.actions.Utils.getSFTPClient;

public class Verifier implements CredentialsVerifier {
    @Override
    public void verify(JsonObject conf) throws InvalidCredentialsException {
        SFTPUtils sftpUtils = getSFTPClient(conf);
        try {
            sftpUtils.checkExist("test");
        } catch (JSchException e) {
            e.printStackTrace();
        } catch (SftpException e) {
            e.printStackTrace();
        }
    }
}
