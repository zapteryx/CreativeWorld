package us.creativecraft.Utilities;

import us.creativecraft.CreativeWorld;

public class Logger {

    public static void log(String log){
        CreativeWorld.getInstance().getLogger().info(log);
    }
}
