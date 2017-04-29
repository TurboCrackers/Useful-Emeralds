package com.turbocrackers.usefulemeralds.proxy;

import init.ModItems;

public class ClientProxy implements CommonProxy
{
	@Override
	public void init() 
	{
		ModItems.registerRenders();
	}
}
