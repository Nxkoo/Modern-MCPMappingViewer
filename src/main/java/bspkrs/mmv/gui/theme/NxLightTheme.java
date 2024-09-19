package bspkrs.mmv.gui.theme;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

public class NxLightTheme
	extends FlatMacLightLaf
{
	public static final String NAME = "NxLightTheme";

	public static boolean setup() {
		return setup( new NxLightTheme() );
	}

	public static void installLafInfo() {
		installLafInfo( NAME, NxLightTheme.class );
	}

	@Override
	public String getName() {
		return NAME;
	}
}
