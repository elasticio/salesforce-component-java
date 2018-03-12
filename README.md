# DemandWare XML file
## Description
This can be used to upload xml file to sftp server.
Input structure corresponds to provided xml samples. 
## Credentials
#### hostname
#### port
#### username
#### password
#### destDir
## Actions
### SubmitRequest
Component accepts data in format described at schema:
`./src/main/schemas/submit.json` 

Then transforms it into XML, format described at schema:
`.src/xsd/Schema.xsd`

File name is form according to:
`LT_DemandwareProduct_(yyyy-MMM-dd.HH.mm.ss).xml`

Then uploads to SFTP configured in credentials.