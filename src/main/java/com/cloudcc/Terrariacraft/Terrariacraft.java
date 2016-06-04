package com.cloudcc.Terrariacraft;

import net.minecraft.init.Blocks;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.commons.lang3.JavaVersion;
import org.apache.commons.lang3.SystemUtils;

/**
 * Created by Tobias on 04.06.2016.
 */
@Mod(modid = Terrariacraft.MODID, version = Terrariacraft.VERSION)
public class Terrariacraft
{
    @Mod.Instance(ModInfo.MOD_ID)
    public static Terrariacraft instance;
    @SidedProxy(clientSide = ModInfo.CLIENT_ROXY_CLASS, serverSide = ModInfo.SERVER_PROXY_CLASS)
    //TODO public static IProxy proxy;
    public static Configuration configuration;
    public static final String MODID = "terrariacraft";
    public static final String VERSION = "1.0";

    static {
        FluidRegistry.enableUniversalBucket();
    }


    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
        if (!SystemUtils.isJavaVersionAtLeast(JavaVersion.JAVA_1_7)){
           System.out.println("%s requires Java 7 or newer, Please update your java");
        }
        System.out.println("DIRT BLOCK >> "+ Blocks.dirt.getUnlocalizedName());
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postinit(FMLPostInitializationEvent event)
    {

    }
}
