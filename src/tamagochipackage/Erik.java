package tamagochipackage;

public class Erik extends Animals {
	public Erik() {
		int heighErik = (int) (Math.random() * (20) + 1);
		double heightDoubleErik = (double) heighErik / 10;
		this.setHeight(heightDoubleErik);
		this.setHealth(11);
		this.setHunger(11);
		this.setEnergy(11);
		this.setName("Erik");
		this.setHairColor("Roux");
		this.setColor("Orange");
		this.setLifeTime(1);
	}

	@Override
	public void ascii() {
		System.out.println("                                         `::..   .\r\n"
				+ "                           `?XXX.  `T{/:.   %X/!!x \"?x.\r\n"
				+ "                             \"4{7@( '!+!!X(:.`4!!X!x.?h7h\r\n"
				+ "                         `!(:. ~!!!f(~!!!+!!{{.'~+h!tX!!?hh:.\r\n"
				+ "                    '`X!.  !(d!X!!H!?{{``\"!:?{{!{X*!?tX!!H*))h.\r\n"
				+ "                  ...  '!X(!X!{{?@f!!!{!{x.!!%!!!%!!!)@Thh!!X)!).\r\n"
				+ "                   ^!!!{:!(((!!: ~((({!!!h+!{{!X!+%?+{!!?!+)!+X(!+\r\n"
				+ "               -    `\\tXX{(~!!!!!:.!.%%(!!!!!!!!!X!))!!!!X%``%!!!(>\r\n"
				+ "               ^X>:x. {!!!!X: ~!!*!{!!!{!~!X!)%!{!!!)?@!!!?!)?!!!>~\r\n"
				+ "                 `X(!!:!!!{{(!!.)!%(:\\!!:%~!~\\!t!! `H!)~~!!!!!!(?@\r\n"
				+ "                  `!X: `)!!!C44XX!!!.%%.X:>-> %!!X! /!~!.'!> !S!!!\r\n"
				+ "              +{..  \\X%\\.'{??X!!!t!!~!!{!~!~'.!~~~ -~` {> !~ /!X`\r\n"
				+ "                `X!XXM!!4!%\\(4!!!!%(`,zccccd$$$$$$$$$ccx ` .~\r\n"
				+ "                  \"XLS@!)!!%L44X!!! d$$$$$$$$$$$$$$$$$$$,  '^\r\n"
				+ "                   `!X?%:!!??X!4?*';$$$$$$$$$$$$$$$$$$$$$\r\n"
				+ "                  `iXM:!!?Xt!XH!!! 9$$$$$$$$$$$$$$$$$$$$$\r\n"
				+ "                   `X3tiXS#?WH!X!! $$$$$$$$$$$$$$$$$$$$$$\r\n"
				+ "                   .MX?*StXX?X!!W? $$$$$$$>?$$$$$$$$$$$$\r\n"
				+ "                    8??M%T%' r `  ;$$$$$$$$$,?$$$$$$$$$F\r\n"
				+ "                    'StMX!': J$$d$$$$$$$$$$$$h ?$$$$$$\"\r\n"
				+ "                     tM9MH d$$$$$$$$$$$$$$C???r{$$$F,r\r\n"
				+ "                     4M?t':$$$$$$$$$$$$$$$$h. $$$,cP\"\r\n"
				+ "                     'M>.d$$$$$$$$$$$$$$$$$>d$$${.,\r\n"
				+ "                      ,d$$$$$$$$$$$$$$$$$'cd$$$$r\"\r\n"
				+ "                      `$$$$$$$$$$$$$$$??$Jcii`?$h\r\n"
				+ "                       $$$$$$$$$$$$$F,;;, \"?h,`$$h\r\n"
				+ "                      j$$$$$$$$$$$$$.CC>>>>c`\"  `\"        ..,g q,\r\n"
				+ "                   .'!$$$$$$$$$$$$$' `''''''            aq`?g`$.Bk\r\n"
				+ "               ,- '  \"?$$$$$$$$$$$$$$d$$$$$c, .         .)od$$$$$$\r\n"
				+ "          , -'           `\"\"'   `\"?$$$$$$$$$??=      .d$$$$$$$$F'\r\n"
				+ "        ,'                           `??$$P       .ed$$P\"\"   `\r\n"
				+ "       ,                                `.      z$$$\"\r\n"
				+ "       `:dbe,                          x,/    e$$F'\r\n"
				+ "       :$$$$P'`>                       $F  z$$$\"\r\n"
				+ "      d$$$P\"'  >                       $Fe$$$\"\r\n"
				+ "    .$$$?F     ;                       $$$$\"\r\n"
				+ "    $$$$$$eeu. >                       >P\"\r\n" + "     `\"\"???$$$$$eu,._''uWb,            )\r\n"
				+ "               `\"\"??$P$$$$$$b.         :\r\n" + "                >     ?$$$\"'           {\r\n"
				+ "                F      `\"              `:\r\n" + "                >                       `>\r\n"
				+ "                >                        ?\r\n" + "               J                          :\r\n"
				+ "               X                ..  .     ?\r\n" + "               \"{ 4{!~;/'!>{`~{>~.>! ~! '\"\r\n"
				+ "                '>!>=.%=.;~~>~4~`{'>>>~!\r\n" + "                 4'!/>!\\\\!{~~:/{;!{;`;/=':\r\n"
				+ "                 `=;!~:`~!>{.-; \"(>=.':!;'\r\n" + "                  :;=.~{`;`~>!~> ?!/>>~!!{'\r\n"
				+ "                  ~:~'!!;`;`~:>); ;(.uJL!~~\r\n" + "                    >L.(.:,L;L:-+d$$$$$$\r\n"
				+ "                    :4$$$$$$$L   ?$$#$$$>\r\n" + "                     '$$$B$$$>    $$$MB$&\r\n"
				+ "                      $$$$$$$      $$$@$F\r\n" + "                      `$$$$$$>     R$$$$\r\n"
				+ "                       $$$$$$     {$$@$P\r\n" + "                       $R$$$R     `!)=!>\r\n"
				+ "                       $$$6T       $$$$'\r\n" + "                       $$R$B      ;$$$F,._\r\n"
				+ "                       !=!(!    .'        ``= .\r\n"
				+ "                       $$$$F    (.             '\\\r\n"
				+ "                     ,{$$$$(      ``~'`` --:.._.,)\r\n" + "                    ;   ``  `-.\r\n"
				+ "                    (          \"\\.\r\n" + "                     ` -{._       \".\r\n"
				+ "                           `~:,._ .:\r\n" + "");

	}

	@Override
	public String showBar(int valeursStats) {
		return ("|||||||||||".substring(0, valeursStats) + "***********".substring(valeursStats, 11));
	}

	/**
	 * get the getAppearance() of Animals and add the mane color
	 */
	public String getAppearance() {
		String appearance = "\n Je suis un erik \n mes cheveux sont " + this.getHairColor();
		return (super.getAppearance() + appearance);
	}

	/**
	 * add the bar at the method showStats of animals
	 */
	public String showStats() {
		return (super.showStats() + "\n Mon estomac est remplie a " + this.getHunger() + " sur 11  "
				+ showBar(this.getHunger()) + "\n Ma barre de wc est a " + this.getWc() + "             "
				+ showBar(this.getWc()) + "\n Ma barre d'energie est a " + this.getEnergy() + " sur 11   "
				+ showBar(this.getEnergy()) + "\n Ma santé est a " + this.getHealth() + " sur 11             "
				+ showBar(this.getHealth()));
	}

	/**
	 * we cannot name erik, or decid his color
	 */
	public void askInfo() {
	}

	/**
	 * set all the stats at max
	 */
	public String toProgram() {
		this.setWc(0);
		this.setHealth(11);
		this.setHunger(11);
		this.setEnergy(11);
		this.setLifeTime(999);
		return ("Je viens de creer super mario \n Level up \n ma vie est maintenant de 11 \n ma faim est maintenant de 11 \n mon energie est maintenant de 11 \n je n'ai plus envie d'aller au toilettes \n mon nombre d'actions est de 999.");

	}

}
