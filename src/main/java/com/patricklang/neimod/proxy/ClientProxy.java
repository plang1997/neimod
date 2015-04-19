package com.patricklang.neimod.proxy;

import com.patricklang.neimod.init.NEIItems;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenders(){
		NEIItems.registerRenders();
	}
}
