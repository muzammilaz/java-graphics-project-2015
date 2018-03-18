import java.applet.Applet;
import java.awt.*;
import java.awt.geom.*;

public class FrereHall extends Applet{
	Color base = new Color(252,195,128);
	public void paint(Graphics g){
		Graphics2D g1 = (Graphics2D) g;
		g1.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
		drawSky(g);
		drawGrass(g);
		drawRoof(g);
		drawLeftTower(g);
		drawCanopy(g);
		drawRightTower(g);
		drawTrunk(g);
		drawTree(g);
		Image  image = getImage(getCodeBase(),
	    		     "emblem.png");
		g1.drawImage(image, 0, 10, 200, 200, this);

	}
	void drawTrunk(Graphics g){
		//g.translate(0,-60);
		//First Tree
		{
			g.translate(-3,0);
		Graphics2D g2 = (Graphics2D) g;
		//Trunk
				{
					GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
				path.moveTo(108,619);
	 			path.quadTo(84.0,663.5,114,743.5);
	 			path.lineTo(87,743.5);
	 			path.quadTo(73.0,670.5,99,619.5);
 			    path.closePath();
 			    g.setColor(new Color(116,55,14));
 			    g2.fill(path);
				}
	g.translate(3,0);
}
	//Second Tree
	{
		g.translate(680,0);
g.translate(-3,0);
		Graphics2D g2 = (Graphics2D) g;
		//Trunk
				{
					GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
				path.moveTo(108,619);
	 			path.quadTo(84.0,663.5,114,743.5);
	 			path.lineTo(87,743.5);
	 			path.quadTo(73.0,670.5,99,619.5);
 			    path.closePath();
 			    g.setColor(new Color(116,55,14));
 			    g2.fill(path);
				}
	g.translate(3,0);
	g.translate(-680,0);
}
	}
	void drawTree(Graphics g){
				Graphics2D g2 = (Graphics2D) g;
 			    //leaves
				//First Tree
				{
				GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
				for(int i=0;i<6;++i){
				g2.rotate(-0.4*i,101.5,617.0);
				g.setColor(new Color(14, 165, 14));
	 			path.moveTo(101.5,617);
	 			path.quadTo(141.0,628,150.5,679);
	 			path.lineTo(141.5,683);
	 			path.lineTo(149,674);
	 			path.lineTo(138.5,679);
	 			path.lineTo(147.5,667);
	 			path.lineTo(136,675);
	 			path.lineTo(145,660);
	 			path.lineTo(134.5,669);
	 			path.lineTo(141,652);
	 			path.lineTo(131.5,662.5);
	 			path.lineTo(136.5,645);
	 			path.lineTo(126.5,655.5);
	 			path.lineTo(131,638);
	 			path.lineTo(122,648.5);
	 			path.lineTo(124.5,633.5);
	 			path.lineTo(120,641);
	 			path.lineTo(119,627);
	 			path.lineTo(115,633);
	 			path.lineTo(113,622);
	 			path.lineTo(110.5,629);
	 			path.lineTo(107,620);
	 			path.lineTo(105.5,625);
	 			path.lineTo(101.5,617);
 			    path.closePath();
 			    g2.fill(path);
				g.setColor(new Color(8, 107, 8));
 			    g2.draw(path);
				g2.rotate(0.4*i,101.5,617.0);
}
g2.scale(-1.0,1.0);
g.translate(-200,0);
for(int i=0;i<7;++i){
				g2.rotate(-0.4*i,101.5,617.0);
				g.setColor(new Color(14, 165, 14));
	 			path.moveTo(101.5,617);
	 			path.quadTo(141.0,628,150.5,679);
	 			path.lineTo(141.5,683);
	 			path.lineTo(149,674);
	 			path.lineTo(138.5,679);
	 			path.lineTo(147.5,667);
	 			path.lineTo(136,675);
	 			path.lineTo(145,660);
	 			path.lineTo(134.5,669);
	 			path.lineTo(141,652);
	 			path.lineTo(131.5,662.5);
	 			path.lineTo(136.5,645);
	 			path.lineTo(126.5,655.5);
	 			path.lineTo(131,638);
	 			path.lineTo(122,648.5);
	 			path.lineTo(124.5,633.5);
	 			path.lineTo(120,641);
	 			path.lineTo(119,627);
	 			path.lineTo(115,633);
	 			path.lineTo(113,622);
	 			path.lineTo(110.5,629);
	 			path.lineTo(107,620);
	 			path.lineTo(105.5,625);
	 			path.lineTo(101.5,617);
 			    path.closePath();
 			    g2.fill(path);
				g.setColor(new Color(8, 107, 8));
 			    g2.draw(path);
				g2.rotate(0.4*i,101.5,617.0);
}

g.translate(200,0);
g2.scale(-1.0,1.0);
}
//Second Tree
				{

g.translate(680,0);//To make it Right
				GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
				for(int i=0;i<6;++i){
				g2.rotate(-0.4*i,101.5,617.0);
				g.setColor(new Color(14, 165, 14));
	 			path.moveTo(101.5,617);
	 			path.quadTo(141.0,628,150.5,679);
	 			path.lineTo(141.5,683);
	 			path.lineTo(149,674);
	 			path.lineTo(138.5,679);
	 			path.lineTo(147.5,667);
	 			path.lineTo(136,675);
	 			path.lineTo(145,660);
	 			path.lineTo(134.5,669);
	 			path.lineTo(141,652);
	 			path.lineTo(131.5,662.5);
	 			path.lineTo(136.5,645);
	 			path.lineTo(126.5,655.5);
	 			path.lineTo(131,638);
	 			path.lineTo(122,648.5);
	 			path.lineTo(124.5,633.5);
	 			path.lineTo(120,641);
	 			path.lineTo(119,627);
	 			path.lineTo(115,633);
	 			path.lineTo(113,622);
	 			path.lineTo(110.5,629);
	 			path.lineTo(107,620);
	 			path.lineTo(105.5,625);
	 			path.lineTo(101.5,617);
 			    path.closePath();
 			    g2.fill(path);
				g.setColor(new Color(8, 107, 8));
 			    g2.draw(path);
				g2.rotate(0.4*i,101.5,617.0);
}
g2.scale(-1.0,1.0);
g.translate(-200,0);
for(int i=0;i<7;++i){
				g2.rotate(-0.4*i,101.5,617.0);
				g.setColor(new Color(14, 165, 14));
	 			path.moveTo(101.5,617);
	 			path.quadTo(141.0,628,150.5,679);
	 			path.lineTo(141.5,683);
	 			path.lineTo(149,674);
	 			path.lineTo(138.5,679);
	 			path.lineTo(147.5,667);
	 			path.lineTo(136,675);
	 			path.lineTo(145,660);
	 			path.lineTo(134.5,669);
	 			path.lineTo(141,652);
	 			path.lineTo(131.5,662.5);
	 			path.lineTo(136.5,645);
	 			path.lineTo(126.5,655.5);
	 			path.lineTo(131,638);
	 			path.lineTo(122,648.5);
	 			path.lineTo(124.5,633.5);
	 			path.lineTo(120,641);
	 			path.lineTo(119,627);
	 			path.lineTo(115,633);
	 			path.lineTo(113,622);
	 			path.lineTo(110.5,629);
	 			path.lineTo(107,620);
	 			path.lineTo(105.5,625);
	 			path.lineTo(101.5,617);
 			    path.closePath();
 			    g2.fill(path);
				g.setColor(new Color(8, 107, 8));
 			    g2.draw(path);
				g2.rotate(0.4*i,101.5,617.0);
}

g.translate(200,0);
g2.scale(-1.0,1.0);
g.translate(-680,0);//to Make it left again

}

}
	void drawNames(Graphics g){
			g.setColor(Color.WHITE);
			g.setFont(new Font("Berlin Sans FB", Font.PLAIN, 50));
    		g.drawString("FRERE HALL",620,50);

			g.setFont(new Font("Berlin Sans FB", Font.PLAIN, 22));
    		g.drawString("Muzammil",770,90);
    		g.drawString("Sufyan",770,110);
    		g.drawString("Basim",770,130);
    		g.drawString("Hamza",770,150);
	}

	void drawTrees(Graphics g){
		
		g.setColor(new Color(26,118,25));

		g.setColor(new Color(77,38,38));
		g.fillRect(26,667,6,36);
		g.drawLine(55,700,71,600);
		g.drawLine(56,700,72,600);
		g.drawLine(57,700,73,600);
		g.drawLine(58,700,74,600);
		g.drawLine(59,700,75,600);
		g.drawLine(60,700,76,600);

		g.drawLine(106,704,111,675);
		g.drawLine(111,675,118,657);
		g.drawLine(107,704,112,675);
		g.drawLine(112,675,119,657);
		g.drawLine(108,704,113,675);
		g.drawLine(113,675,120,657);
		g.drawLine(109,704,114,675);
		g.drawLine(114,675,121,657);

		g.setColor(new Color(9,179,9));
		g.fillOval(-21,514,48,47);
		g.fillOval(7,494,48,47);
		g.fillOval(37,479,48,47);
		g.fillOval(61,492,48,47);
		g.fillOval(81,520,54,53);
		g.fillOval(103,551,66,64);
		{
			int xpoints[]={31,	49,	55,	81,101,124,138,160,187,175,170,175,	95,	0,	0,	0,	31};
			int ypoints[]={674,671,677,674,655,661,676,675,670,675,657,625,538,507,584,674,674};
			g.fillPolygon(xpoints,ypoints,xpoints.length);
		}
		Graphics2D g1 = (Graphics2D) g;
		AffineTransform transformer = new AffineTransform();
    transformer.scale(1.0, 1.0);
    g1.setTransform(transformer);
    }
	    
	void drawRightTower(Graphics g){
		Graphics2D g1 = (Graphics2D) g;
		g.setColor(Color.BLACK);
		{

			g.drawLine(723,147,723,79);
			int xpoints[]={707,707,715,731,740,740,707};
			int ypoints[]={178,158,147,147,156,178,178};
			g.drawPolyline(xpoints,ypoints,xpoints.length);
			int xpoints1[]={715,715,723};
			int ypoints1[]={178,157,147};
			g.drawPolyline(xpoints1,ypoints1,xpoints1.length);
			int xpoints2[]={729,729,723};
			int ypoints2[]={178,157,147};
			g.drawPolyline(xpoints2,ypoints2,xpoints2.length);
			
			
		}
		{
			g.drawLine(325,448,675,448);	
		}

		{
			g.drawLine(325,469,675,469);
		}

		//top Part
		{
			int xpoints[]={703,715,733,748,703};
			int ypoints[]={296,179,179,296,296};
			g.setColor(new Color(153,72,79));
			g.fillPolygon(xpoints,ypoints,xpoints.length);
		}
		{
			int xpoints[]={707,739,773,748,731,715,703,749,677,707};
			int ypoints[]={178,178,295,295,178,178,295,295,295,178};
			g.setColor(new Color(153,72,79));
			g.fillPolygon(xpoints,ypoints,xpoints.length);
			g.setColor(Color.BLACK);
			g.drawPolygon(xpoints,ypoints,xpoints.length);
		}
		//left Panel
		{
			int xpoints[]={668,698,698,668,668};
			int ypoints[]={295,285,677,666,295};
			g.setColor(base);
			g.fillPolygon(xpoints,ypoints,xpoints.length);
			g.setColor(Color.BLACK);
			g.drawPolygon(xpoints,ypoints,xpoints.length);
		}
		//mid Panel
		{
			int xpoints[]={698,745,745,698,698};
			int ypoints[]={285,285,677,677,285};
			g.setColor(base);
			g.fillPolygon(xpoints,ypoints,xpoints.length);
			g.setColor(Color.BLACK);
			g.drawPolygon(xpoints,ypoints,xpoints.length);
		}
		//Right Panel
		{
			int xpoints[]={745,780,780,745,745};
			int ypoints[]={285,295,666,677,285};
			g.setColor(base);
			g.fillPolygon(xpoints,ypoints,xpoints.length);
			g.setColor(Color.BLACK);
			g.drawPolygon(xpoints,ypoints,xpoints.length);
		}

		// Triangles
		{
			int xpoints[]={774,775,782,784,781,780,772,774};
			int ypoints[]={261,250,250,295,314,294,278,261};
			g.setColor(base);
			g.fillPolygon(xpoints,ypoints,xpoints.length);
			g.setColor(Color.BLACK);
			g.drawPolygon(xpoints,ypoints,xpoints.length);
		}
		
		{
			int xpoints[]={665,672,676,680,686,709,694,668,667,664,665};
			int ypoints[]={254,254,260,246,246,284,289,297,312,296,254};
			g.setColor(base);
			g.fillPolygon(xpoints,ypoints,xpoints.length);
			g.setColor(Color.BLACK);
			g.drawPolygon(xpoints,ypoints,xpoints.length);
		}
		
		{
			int xpoints[]={698,721,751,751,698};
			int ypoints[]={288,239,281,287,288};
			g.setColor(base);
			g.fillPolygon(xpoints,ypoints,xpoints.length);
			g.setColor(Color.BLACK);
			g.drawPolygon(xpoints,ypoints,xpoints.length);
		}
		{
			int xpoints[]={665,672,676,680,686,709,694,668,667,664,665};
			int ypoints[]={254,254,260,246,246,284,289,297,312,296,254};
			g.setColor(base);
			g.fillPolygon(xpoints,ypoints,xpoints.length);
			g.setColor(Color.BLACK);
			g.drawPolygon(xpoints,ypoints,xpoints.length);
		}
		{
			int xpoints[]={698,721,751,751,698};
			int ypoints[]={288,239,281,287,288};
			g.setColor(base);
			g.fillPolygon(xpoints,ypoints,xpoints.length);
			g.setColor(Color.BLACK);
			g.drawPolygon(xpoints,ypoints,xpoints.length);
		}
		{
			int xpoints[]={745,760,769,784,751,743,745};
			int ypoints[]={273,244,244,295,287,287,273};
			g.setColor(base);
			g.fillPolygon(xpoints,ypoints,xpoints.length);
			g.setColor(Color.BLACK);
			g.drawPolygon(xpoints,ypoints,xpoints.length);
		}

				g.setColor(new Color(39,20,35));
		// holes
		{

			g.fillOval(721,263,8,9);
			g.fillOval(717,268,8,9);
			g.fillOval(725,268,8,9);

		}	
			//right tower holes
		{
				g.fillOval(218,397,6,6);
				g.fillOval(230,397,6,6);
				g.fillOval(242,397,6,6);
				g.fillOval(254,397,6,6);
			}
			{
				g.fillOval(277,398,6,6);
				g.fillOval(287,400,6,6);
				g.fillOval(297,402,6,6);
				g.fillOval(307,403,6,6);
			}
			{
				g.fillOval(200,400,4,5);
				g.fillOval(195,402,4,5);
				g.fillOval(191,404,3,5);
				g.fillOval(187,406,3,5);
			}

			//windows narrow
			//left panel windows
			g.fillOval(283,470,7,21);
			g.fillRect(283,480,7,51);
			g.fillOval(295,470,7,21);
			g.fillRect(295,480,7,51);

		Graphics2D g2 = (Graphics2D) g;
			{
				g2.translate(0,130);
			g.fillOval(283,470+5,7,21);
			g.fillOval(295,470+5,7,21);
			g2.shear(0,-0.4);
			g2.translate(0,120);
			g.fillRect(283,480,7,51);
			g.fillRect(295,480,7,51);
			g2.translate(0,-120);
			g2.shear(0,0.4);
			g2.translate(0,-130);
			}


			g.fillRect(227,480,8,51);
			g.fillRect(242,480,8,51);


			{
				int xpoints[]={668,698,750,780};
				int ypoints[]={432,425,425,428};
				g.drawPolyline(xpoints,ypoints,xpoints.length);
			}
			{
				int xpoints[]={668,698,750,780};
				int ypoints[]={560,555,555,557};
				g.drawPolyline(xpoints,ypoints,xpoints.length);
			}
			//top half window panel outline in right pillar
			{
				int xpoints[]={713,735,735,732,724,718,713};
				int ypoints[]={416,416,330,321,316,321,330};
				g.drawPolygon(xpoints,ypoints,xpoints.length);
			}
			{
				int xpoints[]={680-5,680-5,682-5,689-5,694-5,696-5,696-5};
				int ypoints[]={420,337,329,322,328,335,416};
				g.drawPolygon(xpoints,ypoints,xpoints.length);
			}
			{
				int xpoints[]={753+2,770+2,770+2,768+2,762+2,756+2,753+2,753+2};
				int ypoints[]={415,417,336,327,318,327,345,415};
				g.drawPolygon(xpoints,ypoints,xpoints.length);	
			}
			//fill in narrow windows right
			{
				g.setColor(new Color(39,20,35));
				g.fillOval(726,337,7,20);
				g.fillRect(726,347,7,67);
				g.fillOval(717,337,7,20);
				g.fillRect(717,347,7,67);
			}
			//middle part narrow windiws
			{
				g.fillOval(730-5,481,7,17);
				g.fillRect(730-5,489,7,54);
				g.fillOval(715-5,481,7,17);
				g.fillRect(715-5,489,7,54);
			}
			//middle part narrow windiws
			{
				g.fillOval(730-5,481+100,13,37);
				g.fillRect(730-5,489+105,13,74);
				g.fillOval(715-5,481+100,13,37);
				g.fillRect(715-5,489+105,13,74);
			}
			//middle part narrow windiws
			{
				g.fillOval(730-490,481+120,13,37);
				g.fillRect(730-490,489+125,13,74);
				g.fillOval(715-490,481+120,13,37);
				g.fillRect(715-490,489+125,13,74);
			}
			//Centre AREA lines small
			{

				int x1=-10;
				for(int i=1;i<35;++i){
					g.fillOval(340+x1,457,3,3);
					g.drawLine(344+x1,469,339+x1,475);
					x1+=10;
				}

			}
			//penal boudaries
			{
				g.drawRect(704,433,33,115);
				{
					int xpoints[]={672,672,692,692,672};
					int ypoints[]={440,550,547,435,440};
					g.drawPolygon(xpoints,ypoints,xpoints.length);
				}
				{
					int xpoints[]={754,774,774,754,754};
					int ypoints[]={433,436,549,548,433};
					g.drawPolygon(xpoints,ypoints,xpoints.length);
				}
				g1.translate(0,129);
				g.drawRect(705,433,36,110);
				

				g1.translate(0,-129);
			
			}
			//single Flower
			{
					g1.translate(347.5,-118.0);
					int xpoints[]={379,383,375,384,384,375,383,379,375,377,373,375,370,367,375,366,366,375,367,370,375,372,377,375};
					int ypoints[]={563,566,571,569,573,571,576,579,571,580,580,571,579,576,571,573,569,571,566,563,571,562,562,571};
					g.setColor(Color.WHITE);
					g.fillPolygon(xpoints,ypoints,xpoints.length);
					g.setColor(Color.BLACK);
					g.fillOval(372,568,6,6);
					g1.translate(-347.5,118.0);
			}
			//line Touchup
			{
				g.drawLine(676,260,664,297);
				g.drawLine(678,250,700,287);
				int xp[]={769,753,753};
				int yp[]={245,279,288};
				g.drawPolyline(xp,yp,xp.length);

			}
			//tOP RIGHT BLACK holes
			{
				g.fillOval(676,271,13,13);
				g.fillOval(760,271,13,13);
				
			}

			//CLOUDS
			{
				float n=0.1f;
				int x=0,y=0;
				for(int i=1;i<9;++i){
					AlphaComposite myAlpha = AlphaComposite.getInstance(AlphaComposite.SRC_OVER,n);
		g2.setComposite(myAlpha);
		g.setColor(new Color(230,230,230));
		g.fillOval(170-x,90-y,200+x*2,90+y*2);
		g.fillOval(300-x,120-y,100+x*2,40+y*2);
		g.fillOval(500-x,120-y,130+x*2,60+y*2);
		g.fillOval(540-x,100-y,150+x*2,70+y*2);


		g.fillOval(720-x,70-y,80+x*2,30+y*2);
		g.fillOval(740-x,50-y,150+x*2,70+y*2);
		x+=3;
		y+=3;
		//n-=0.1f;

				}
				AlphaComposite myAlpha2 = AlphaComposite.getInstance(AlphaComposite.SRC_OVER,1.0f);
		g2.setComposite(myAlpha2);
			}

	}
		void drawCanopy(Graphics g){
		//CANOPY TOP
		{
			g.setColor(new Color(153,72,79));
			int xpoints[]={358,378,390,390,358,358};
			int ypoints[]={272,131,263,295,297,272};
			g.fillPolygon(xpoints,ypoints,xpoints.length);
			g.setColor(Color.BLACK);
			g.drawPolygon(xpoints,ypoints,xpoints.length);
		}
		//Canopy Bottm
		{
			g.setColor(new Color(153,72,79));
			int xpoints[]={354,361,375,393,393,392,393,392,388,383,374,369,361,358,354,354};
			int ypoints[]={353,360,360,347,282,273,282,273,284,269,284,268,285,272,280,352};
			g.fillPolygon(xpoints,ypoints,xpoints.length);
			g.setColor(Color.BLACK);
			g.drawPolygon(xpoints,ypoints,xpoints.length);
		}
		//CANOPY EMPTY AREA
		{
			g.setColor(new Color(81,140,196));
			int xpoints[]={361,361,368,372,372,361};
			int ypoints[]={333,294,285,294,333,333};
			g.fillPolygon(xpoints,ypoints,xpoints.length);

			g.setColor(Color.BLACK);
			g.drawPolygon(xpoints,ypoints,xpoints.length);
		}
		{

			g.setColor(new Color(81,140,196));
			int xpoints[]={379,377,377,385,385,379};
			int ypoints[]={288,294,333,333,295,288};
			g.fillPolygon(xpoints,ypoints,xpoints.length);
			g.setColor(Color.BLACK);
			g.drawPolygon(xpoints,ypoints,xpoints.length);
		}
		{
			g.setColor(Color.BLACK);
			int xpoints[]={385,383,380,376,372,369};
			int ypoints[]={210,203,210,202,210,202};
			g.drawPolyline(xpoints,ypoints,xpoints.length);
			g.drawLine(378,131,374,360);
		}
	}
	public void drawRoof(Graphics g){

		Graphics2D g1 = (Graphics2D) g;
	 	/**				1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16	17	18	19	20	21	1	
	 	*int xPoints[]={245,263,269,354,354,382,394,392,670,670,679,688,709,738,760,769,782,782,187,187,210,245};
		*int yPoints[]={320,320,339,339,263,123,263,339,339,290,245,245,178,178,245,245,290,698,690,404,390,320};
		**/
		
		g.setColor(Color.BLACK);
		

		g.fillOval(722,456,10,10);
		g.drawRect(715,6826,7,48);

		//MID area
		{
		g.setColor(base);
		g.fillRect(300,410,375,256);
		g.setColor(Color.BLACK);
		g.drawRect(300,410,375,256);
		}
		//upper flower designs
		{
			int x=-25;
			for(int i=1;i<16;++i){
			int xpoints[]={356+x,358+x,356+x,358+x,358+x,356+x,358+x,355+x,354+x,354+x,351+x,351+x,349+x,347+x,349+x,347+x,347+x,349+x,347+x,349+x,351+x,351+x,354+x,354+x};
			int ypoints[]={484,487,488,488,491,491,493,495,494,496,496,494,495,493,491,491,488,488,487,484,486,484,484,486};
			g.setColor(Color.WHITE);
			g.fillPolygon(xpoints,ypoints,xpoints.length);
			g.setColor(Color.BLACK);
			g.drawPolygon(xpoints,ypoints,xpoints.length);
			g.fillOval(352+x,489,2,2);
			x+=24;
			}
		}
			//outer WHITE shape of gates
			{
			int x=350,y=600,w=0,x1=0;
			for(int j=0;j<7;j++){
				 y=570;w=0;
				if(j!=0){
					x+=74;}
			for(int i=2;i<20;++i){
		g.setColor(Color.WHITE);
			g.fillArc(x,y,w,40,0,180);
			{
			g.setColor(Color.BLACK);
			//g.drawArc(x,y-1,w+1,40,0,180);
		}
			g.setColor(Color.WHITE);
			if(i%3.0==0.0)
				y+=2;
			if(i<10){
				w+=4;x-=2;
			}
			else{
			w+=2;
			x-=1;}
			}
			g.fillRect(x+1,y+15,w-2,30);
			/*if(j!=0){
					g.setColor(Color.BLACK);
					g.drawLine(x-49+51,y+10,x-49+51,y+45);}*/

			//g.drawRect(x+1,y+15,w-2,30);
			// lines
			{
					//int xpoints[]={325,326,329,334,339,343,375,366,358,375,371,375,375};
					//int ypoints[]={609,598,590,585,580,576,622,582,576,600,589,616,608};

			g.setColor(Color.BLACK);
					g.drawLine(351+x1,626,349+x1,571);
					g.drawLine(351+x1,626,324+x1,622);
					g.drawLine(351+x1,626,326+x1,616);
					g.drawLine(351+x1,626,325+x1,609);
					g.drawLine(351+x1,626,326+x1,598);
					g.drawLine(351+x1,626,329+x1,590);
					g.drawLine(351+x1,626,334+x1,585);
					g.drawLine(351+x1,626,339+x1,580);
					g.drawLine(351+x1,626,343+x1,576);
					g.drawLine(351+x1,626,374+x1,622);
					g.drawLine(351+x1,626,366+x1,583);
					g.drawLine(351+x1,626,358+x1,577);
					g.drawLine(351+x1,626,359+x1,601);
					g.drawLine(351+x1,626,371+x1,590);
					g.drawLine(351+x1,626,374+x1,598);
					g.drawLine(351+x1,626,374+x1,617);
					g.drawLine(351+x1,626,374+x1,608);
					//g.drawPolyline(xpoints,ypoints,xpoints.length);
				} 
				x1+=48;
			}//for

			}
			
		// GATES
		{
			int x=350,y=600,w=0;
			int x1=-50;
			for(int j=0;j<7;j++){
				 y=580;w=0;
				if(j!=0)
					x+=70;
			for(int i=2;i<20;++i){
		g.setColor(new Color(147, 98, 44));
			g.fillArc(x,y,w,40,0,180);
			if(i%3.0==0.0)
				y+=2;
			if(i<6){
				w+=4;x-=2;
			}
			else{
			w+=2;
			x-=1;}
			}
			g.fillRect(x+1,y+15,w-2,60);
				//  BOTTOM FLOWERS
				{
					g1.translate(0.0,-8.0);
					int xpoints[]={379+x1,383+x1,375+x1,384+x1,384+x1,375+x1,383+x1,379+x1,375+x1,377+x1,373+x1,375+x1,370+x1,367+x1,375+x1,366+x1,366+x1,375+x1,367+x1,370+x1,375+x1,372+x1,377+x1,375+x1};
					int ypoints[]={563,566,571,569,573,571,576,579,571,580,580,571,579,576,571,573,569,571,566,563,571,562,562,571};
					g.setColor(Color.WHITE);
					g.fillPolygon(xpoints,ypoints,xpoints.length);
					g.setColor(Color.BLACK);
					g.fillOval(372+x1,568,6,6);
					//g.drawPolygon(xpoints,ypoints,xpoints.length);
					g1.translate(0.0,8.0);
				}
				g1.translate(40.0,-140.0);
			{
					int xpoints[]={379+x1,383+x1,375+x1,384+x1,384+x1,375+x1,383+x1,379+x1,375+x1,377+x1,373+x1,375+x1,370+x1,367+x1,375+x1,366+x1,366+x1,375+x1,367+x1,370+x1,375+x1,372+x1,377+x1,375+x1};
					int ypoints[]={563,566,571,569,573,571,576,579,571,580,580,571,579,576,571,573,569,571,566,563,571,562,562,571};
					g.setColor(Color.WHITE);
					g.fillPolygon(xpoints,ypoints,xpoints.length);
					g.setColor(Color.BLACK);
					g.fillOval(372+x1,568,6,6);
					g.drawLine(350+x1,555,350+x1,586);
					//g.drawPolygon(xpoints,ypoints,xpoints.length);
					x1+=48;
					
				}
				g1.translate(-40.0,140.0);

			}


			{
				g1.translate(0.0,-8);
				int xpoints[]={379+x1,383+x1,375+x1,384+x1,384+x1,375+x1,383+x1,379+x1,375+x1,377+x1,373+x1,375+x1,370+x1,367+x1,375+x1,366+x1,366+x1,375+x1,367+x1,370+x1,375+x1,372+x1,377+x1,375+x1};
					int ypoints[]={563,566,571,569,573,571,576,579,571,580,580,571,579,576,571,573,569,571,566,563,571,562,562,571};
					g.setColor(Color.WHITE);
					g.fillPolygon(xpoints,ypoints,xpoints.length);
					g.setColor(Color.BLACK);
					g.fillOval(372+x1,568,6,6);
					g1.translate(0.0,8);
			}
			// end BOTTOM FLOWERS

			}
			//gates shadow
				{
			int x=358,y=600,w=2;
			for(int j=0;j<7;j++){
				 y=590;w=0;
				 if(j==0)
				 	x++;
				 if(j!=5 && j!=0 && j!=6){
					x+=3;
				}
				if(j!=0 && j!=6){
					x+=58+j/2+2;
				}
				else if(j==6){
					x+=61;
					y-=2;}
			for(int i=2;i<14;++i){
		g.setColor(new Color(171, 62, 12));
			g.fillArc(x-(j+2),y-j/2,w+((j+1)*2-1),40,0,180);
			if(i%3.0==0.0)
				y+=2;
			if(i<4){
				w+=4;x-=2;
			}
			else{
			w+=2;
			x-=1;}
			}
			g.fillRect(x-j,y+15,w-2+j*2,54+j/6);
			 if(j!=5 && j!=0 && j!=6){
					x-=3;
				}
			}
			}
		//small windows
		{
			int x=339,y=520,w=0;
			for(int j=0;j<14;j++){
				 y=490;w=0;
				if(j!=0)
					x+=35;
			for(int i=2;i<15;++i){
		g.setColor(new Color(84, 60, 62));
			g.fillArc(x,y,w,20,0,180);
			if(i%2.0==0.0)
				y+=1;
			if(i<13){
				w+=2;x-=1;
			}
			else{
			w+=0;
			x-=0;}
			}
			g.fillRect(x,y+8,w,34);
			g.setColor(base);
			g.fillOval(x+18,y+8,5,5);
			g.fillOval(x-1,y+8,5,5);
			g.setColor(Color.BLACK);
			g.drawOval(x+18,y+8,5,5);
			g.drawOval(x-1,y+8,5,5);

			}
			g.setColor(Color.BLACK);
		g.drawRect(300,410,375,256);
	}	
		//				2	3	36	//	2
		int xPointsk[]={263,269,240,218,263};
		int yPointsk[]={320,339,408,408,320};
		g.setColor(new Color(39,20,35));
		g.fillPolygon(xPointsk,yPointsk,5);
		g.setColor(Color.BLACK);
		g.drawPolygon(xPointsk,yPointsk,5);
		//				1	2	36	37	1
		int xPointst[]={245,263,218,200,245};
		int yPointst[]={320,320,408,408,320};
		g.setColor(base);
		g.fillPolygon(xPointst,yPointst,5);
		g.setColor(Color.BLACK);
		g.drawPolygon(xPointst,yPointst,5);
		//				3	9	29	]]	3
		int xPoints[]={269,670,680,237,269};
		int yPoints[]={339,339,412,412,339};
		g.setColor(new Color(155, 116, 103));
		g.fillPolygon(xPoints,yPoints,5);
		g.setColor(Color.BLACK);
		g.drawPolygon(xPoints,yPoints,5);
			int x1=269;
		int y1=339;
		int x2=237;
		int y2=412;
		for(int i=0;i<39;i++){
			x1+=10;
			x2+=11;
			g.setColor(new Color(119, 81, 68));
			g.drawLine(x1, y1, x2, y2);
		}
		
	

	}
	public void drawLeftTower(Graphics g){
		
		//left Panel
		//				20	21	30	19	20
		{
		int xPoints[]={187,210,210,187,187};
		int yPoints[]={404,393,698,690,404};
		g.setColor(base);
		g.fillPolygon(xPoints,yPoints,5);
		g.setColor(Color.BLACK);
		g.drawPolygon(xPoints,yPoints,5);
		xPoints[0]+=5;
		xPoints[3]+=5;
		xPoints[1]-=5;
		xPoints[2]-=5;
		yPoints[0]+=17;
		yPoints[1]+=22;
		yPoints[2]-=5;
		yPoints[3]-=3;
		xPoints[xPoints.length-1]=xPoints[0];
		yPoints[yPoints.length-1]=yPoints[0];
		g.drawPolygon(xPoints,yPoints,5);
		}
		// mid Panel
		//				21	24	31	30	21
		{
			int xPoints1[]={210,268,268,210,210};
		int yPoints1[]={393,393,698,698,393};
		g.setColor(base);
		g.fillPolygon(xPoints1,yPoints1,5);
		g.setColor(Color.BLACK);
		g.drawPolygon(xPoints1,yPoints1,5);
		xPoints1[0]+=8;
		xPoints1[3]+=8;
		xPoints1[1]-=8;
		xPoints1[2]-=8;
		yPoints1[0]+=20;
		yPoints1[1]+=20;
		yPoints1[2]-=8;
		yPoints1[3]-=8;
		xPoints1[xPoints1.length-1]=xPoints1[0];
		yPoints1[yPoints1.length-1]=yPoints1[0];
		g.drawPolygon(xPoints1,yPoints1,5);
	}
		//right Panel
		//				24	27	32	31
	{
		int xPoints2[]={268,323,323,268,268};
		int yPoints2[]={393,401,665,698,393};
		g.setColor(base);
		g.fillPolygon(xPoints2,yPoints2,5);
		//g.setColor(Color.BLACK);
		g.setColor(Color.BLACK);
		g.drawPolygon(xPoints2,yPoints2,5);
}
		int x0=227;
		int y0=470;
		for(int i=0;i<2;++i){
			g.setColor(new Color(39,20,35));
			g.fillArc(x0, y0, 8, 30, 0, 180);
			g.fillRect(x0,y0+10,8,40);
			x0+=15;
		}
		{
			g.setColor(Color.BLACK);
		int xPoints[]={187,210,268,323,323,675};
		int yPoints[]={550,544,544,546,542,542};
		g.drawPolyline(xPoints,yPoints,6);
		}
		{
		int xPoints[]={187,210,268,323,323,675};
		int yPoints[]={550,544,544,546,542,542};
		g.drawPolyline(xPoints,yPoints,6);
		}
		{
		g.setColor(base);
		int xPoints[]={186,206,267,325,346,346,322,268,207,186,186};
		int yPoints[]={414,406,407,416,430,415,398,391,392,405,414};
		g.fillPolygon(xPoints,yPoints,xPoints.length);
		g.setColor(Color.BLACK);
		g.drawPolygon(xPoints,yPoints,xPoints.length);
		}
		/*{
			g.setColor(Color.BLACK);
		int xPoints[]={187,210,268,323};
		int yPoints[]={550,544,544,546};
		g.drawPolyline(xPoints,yPoints,4);
		}*/
		{
					//miniroof left part		
		g.setColor(new Color(155, 116, 103));
		//				19	21	25	19
		int xPoints[]={187,210,268,187};
		int yPoints[]={404,393,342,404};
		//g.setColor(new Color(155, 116, 103));
		g.fillPolygon(xPoints,yPoints,4);
		g.setColor(Color.BLACK);
		//g.setColor(new Color(119, 81, 68));
		g.drawPolygon(xPoints,yPoints,4);
		//				21	24	25	21
		int xPoints1[]={210,268,268,210};
		int yPoints1[]={393,393,342,393};
		g.setColor(new Color(155, 116, 103));
		//g.setColor(new Color(155, 116, 103));
		g.fillPolygon(xPoints1,yPoints1,4);
		g.setColor(Color.BLACK);
		//g.setColor(new Color(119, 81, 68));
		g.drawPolygon(xPoints1,yPoints1,4);

		g.setColor(new Color(155, 116, 103));
		//				24	26	25	24
		int xPoints2[]={268,305,268,268};
		int yPoints2[]={393,398,342,393};
		//g.setColor(new Color(155, 116, 103));
		g.fillPolygon(xPoints2,yPoints2,4);
		g.setColor(Color.BLACK);
		//g.setColor(new Color(119, 81, 68));
		g.drawPolygon(xPoints2,yPoints2,4);
		
		g.setColor(new Color(84, 60, 62));
		//				25	22	28	26	25
		int xPoints3[]={268,302,330,306,268};
		int yPoints3[]={342,368,404,399,342};
		g.fillPolygon(xPoints3,yPoints3,5);
		g.setColor(Color.BLACK);
		g.drawPolygon(xPoints3,yPoints3,5);
		int x1=268;
		int y1=342;
		int x2=230;
		int y2=393;
		for(int i=0;i<5;i++){
			g.setColor(new Color(119, 81, 68));
			g.drawLine(x1, y1, x2, y2);
			x2+=16;
			if(i==3)
				y2+=4;
		}
		}
		//Outline of panel
		{
			g.setColor(Color.BLACK);
			int xp[]={274,313,312,272,272};
			int yp[]={417,421,659,681,565};
			g.drawPolygon(xp,yp,xp.length);
		}
	}
	void drawSky(Graphics g){
	int y=0;
	int r=70,gr=119,b=165;
		for(int i=0;i<40;++i){
		g.setColor(new Color(r,gr,b));
		g.fillRect(0,y,900,17);
		y+=17;
		r+=2;
		gr+=2;
		b+=2;
	}
	}
	void drawGrass(Graphics g) {

		g.setColor(new Color(14, 165, 14));
		g.fillRect(0, 655, 900, 100);
		int y = 660;
		int x = 0;
		int n = 0;
		int r = 63, gr = 85, b = 11;

		for (int j = 0; j < 19; ++j) {
			for (int i = 0; i < 180; ++i) {
				g.setColor(new Color(r, gr, b));
				if ((int)(Math.random() * 10) % 2 == 0)
					n += 2;
				else
					n -= 2;
				g.drawLine(x, y, n, y - 2);
				x += 5;
				n = x;
			}
			y += 5; x = 0; n = 0;
		}
	}
}