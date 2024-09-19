package bspkrs.mmv.gui.theme;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;

public class NxDarkTheme
	extends FlatMacDarkLaf
{
	public static final String NAME = "NxDarkTheme";

	public static boolean setup() {
		return setup( new NxDarkTheme() );
	}

	public static void installLafInfo() {
		installLafInfo( NAME, NxDarkTheme.class );
	}

	@Override
	public String getName() {
		return NAME;
	}
}
