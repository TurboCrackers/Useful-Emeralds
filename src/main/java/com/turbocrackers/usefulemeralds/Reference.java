package com.turbocrackers.usefulemeralds;

public class Reference 
{
	public static final String MOD_ID = "tue";
	public static final String NAME = "Useful Emeralds";
	public static final String VERSION = "0.1";
	public static final String ACCEPTED_VERSIONS = "[1.11.2]";
	
	//Proxies
	public static final String CLIENT_PROXY_CLASS = "com.turbocrackers.usefulemeralds.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.turbocrackers.usefulemeralds.proxy.ServerProxy";
	
	//Item References
	public static enum UsefulEmeraldsItems 
	{  
		EMERALDSWORD("emerald_sword", "EmeraldSword"),
		EMERALDPICKAXE("emerald_pickaxe", "EmeraldPickaxe"),
		EMERALDAXE("emerald_axe", "EmeraldAxe"),
		EMERALDSHOVEL("emerald_shovel", "EmeraldShovel"),
		EMERALDHOE("emerald_hoe", "EmeraldHoe");
		
		private String unlocalizedName;
		private String registryName;
		
		UsefulEmeraldsItems(String unlocalizedName, String registryName)
		{
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;			
		}
		
		public String getUnlocalizedName()
		{
			return unlocalizedName;
		}
		
		public String getRegistryName()
		{
			return registryName;
		}
	}
}
