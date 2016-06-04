package com.cloudcc.Terrariacraft;

/**
 * Created by Tobias on 04.06.2016.
 */
public class ModInfo {
    public static final String PACKAGE_NAME = "com.cloudcc.Terrariacraft.";
    public static final String MOD_ID = "terrariacraft";
    public static final String MOD_NAME = "Terrariacraft";
    public static final String Version_Build = "@VERSION@";
    public static final String MINECRAFT_VERSION = "@MCVERSION@";
    public static final String DEPENDENCIES = "";
    public static final String SERVER_PROXY_CLASS = PACKAGE_NAME + MOD_ID + ".proxy.ServerProxy";
    public static final String CLIENT_ROXY_CLASS = PACKAGE_NAME + MOD_ID + ".proxy.ClientProxy";
    public static final String FINGERPRING = "@FINGERPRINT@";
    public static final String GUI_FACTORY = PACKAGE_NAME + MOD_ID + ".common.config.ConfigGuiFactory";
    public static final String PATH_INTEGRATIONS = PACKAGE_NAME + MOD_ID + ".common.integrations.";

    private ModInfo(){

    }
}
