package no.runsafe.boatwars;

import no.runsafe.framework.api.IConfiguration;
import no.runsafe.framework.api.event.plugin.IConfigurationChanged;

public class Config implements IConfigurationChanged
{
	public Config()
	{
	}

	@Overried
	public void OnConfigurationChanged(IConfiguration config)
	{
		// update configurations
	}
}