class Config {

    private String connectionName;

    private String dbServer;
    private String dbUser;
    private String dbPassword;

    private String dbView;

    private TransmissionTypes transmissionType;
    private FileTypes fileType;

    private String fileName;
    private String fileHeadName;

    private String remoteServer;
    private String remoteUser;
    private String remotePassword;

    public Config(String connectionName, String dbServer, String dbUser, String dbPassword, String dbView, TransmissionTypes transmissionType, FileTypes fileType, String fileName, String fileHeadName, String remoteServer, String remoteUser, String remotePassword) {
        this.connectionName = connectionName;
        this.dbServer = dbServer;
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;
        this.dbView = dbView;
        this.transmissionType = transmissionType;
        this.fileType = fileType;
        this.fileName = fileName;
        this.fileHeadName = fileHeadName;
        this.remoteServer = remoteServer;
        this.remoteUser = remoteUser;
        this.remotePassword = remotePassword;
    }

    public String getConnectionName() {
        return connectionName;
    }

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    public String getDbServer() {
        return dbServer;
    }

    public void setDbServer(String dbServer) {
        this.dbServer = dbServer;
    }

    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public String getDbView() {
        return dbView;
    }

    public void setDbView(String dbView) {
        this.dbView = dbView;
    }

    public TransmissionTypes getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TransmissionTypes transmissionType) {
        this.transmissionType = transmissionType;
    }

    public FileTypes getFileType() {
        return fileType;
    }

    public void setFileType(FileTypes fileType) {
        this.fileType = fileType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileHeadName() {
        return fileHeadName;
    }

    public void setFileHeadName(String fileHeadName) {
        this.fileHeadName = fileHeadName;
    }

    public String getRemoteServer() {
        return remoteServer;
    }

    public void setRemoteServer(String remoteServer) {
        this.remoteServer = remoteServer;
    }

    public String getRemoteUser() {
        return remoteUser;
    }

    public void setRemoteUser(String remoteUser) {
        this.remoteUser = remoteUser;
    }

    public String getRemotePassword() {
        return remotePassword;
    }

    public void setRemotePassword(String remotePassword) {
        this.remotePassword = remotePassword;
    }
}

