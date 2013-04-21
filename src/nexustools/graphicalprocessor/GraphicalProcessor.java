package nexustools.graphicalprocessor;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "GraphicalProcessor", name = "Graphical Processor", version = "0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)
public class GraphicalProcessor {
	@PreInit
	public void preload(FMLPreInitializationEvent iEvent) {

	}

	@Init
	public void load(FMLInitializationEvent IEvent) {

	}
}
