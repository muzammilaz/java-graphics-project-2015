import java.applet.Applet; 
import java.awt.*; 
import javax.swing.*;
import java.awt.geom.*;

class Calendar{

String monthName;
String[ ] dayName= new String[31];//worst case
int[ ]   dayNo = new int[31];

Calendar(String monthName1, String[ ] dayName1, int[ ] dayNo1){
monthName=monthName1;
dayName= dayName1;
dayNo=dayNo1;
}

}

public class useCalendar extends Applet{
String[ ] months= {
                  " ",
	"January  ",
	"February ",
	"March    ",
	"April    ",
	"May      ",
	"June     ",
	"July     ",
	"August   ",
	"September",
	"October  ",
	"November ",
	"December "
};
int[ ] daysInMonths={0,31,29,31,30,31,30,31,31,30,31,30,31};
String[] dayName={"Mon", "Tue", "Wed", "Thu","Fri", "Sat", "Sun"};
String[ ] dayNameEntireMonth1= new String[31];
int[ ] dayNo1 = new int[31];







    public  void paint(Graphics g) {
    		Graphics2D g1 = (Graphics2D) g;
              int monthToDisplay=2;//change here
              example(g1);
              firstPage(g1, monthToDisplay);
              drawStatement(g);
    }
   public void drawStatement(Graphics g) {
    g.setFont(new Font("Arial Narrow", Font.BOLD, 19));
    g.drawString("Frere Hall, 9th CED Exhibition 2016(Calendars & Planners),:Batch 2015: Roll# 2015-SE-024, 2015-SE-005, 2015-SE-018, 2015-SE-044, Event Manager Zulfiqar Ali Khan",10,40);
    }
   public void firstPage(Graphics2D g, int monthToDisplay) {
    AffineTransform transformer = new AffineTransform();
    transformer.scale(0.8, 0.8);
    g.setTransform(transformer);
      Calendar [ ] obj = new Calendar[13];

     //Sample values for first month i.e January 2016
     /*obj[0].monthName="January";
     obj[0].dayName[0]="Fri";
    obj[0].dayNo[0]=1;*/
    
    //This means dayNameIndex is 4

    //We would use parameterize constructor to assign values

   int month, day, dayNameIndex;
   dayNameIndex=4;
   String str="";
   for(month =1; month<=12; month++) {
     dayNameEntireMonth1 = new String[31];
    for(day=1; day<= daysInMonths[month]; ++day) {
        dayNameEntireMonth1[day-1]= dayName[dayNameIndex];
        dayNo1[day-1] = day;
         dayNameIndex++;
         if(dayNameIndex==7)
             dayNameIndex=0;
    
     }
         obj[month] = new Calendar(months[month], dayNameEntireMonth1, dayNo1);
   }
 int i;
 

   int row=1;
   int col=0;
   int pos_x, pos_y;//pos_y=row*70+3; pos_x=col*100+33
    
   month=monthToDisplay;
   double xorig=0.0;
   double yorig=0.0;
   for(month=1;month<=12;month++)
   {
		row=1;
		col=0;
      int fontSize = 20;
      g.setFont(new Font("TimesRoman", Font.BOLD, fontSize));
      g.setColor(Color.BLACK);
      String strMonth = obj[month].monthName;
      g.drawString(strMonth, 30, 37);
      fontSize = 15;
      g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
      g.setColor(Color.BLACK);
     for ( day = 1; day <= daysInMonths[month]; day++ )
         {   
            if(obj[month].dayName[day-1].equals("Mon")){
               pos_y=row*37+48;
               pos_x=33;
               g.drawString(" " +obj[month].dayNo[day-1], pos_x, pos_y);
               //break;
            }//if
            else if(obj[month].dayName[day-1].equals("Tue")){
               pos_y=row*37+48;
               pos_x=133-63;
               g.drawString(" " +obj[month].dayNo[day-1], pos_x, pos_y);
            }
            else if(obj[month].dayName[day-1].equals("Wed")){
               pos_y=row*37+48;
               pos_x=233-127;
               g.drawString(" " +obj[month].dayNo[day-1], pos_x, pos_y);
            }
            else if(obj[month].dayName[day-1].equals("Thu")){
               pos_y=row*37+48;
               pos_x=333-190;
               g.drawString(" " +obj[month].dayNo[day-1], pos_x, pos_y);
            }
            else if(obj[month].dayName[day-1].equals("Fri")){
               pos_y=row*37+48;
               pos_x=433-254;
               g.drawString(" " +obj[month].dayNo[day-1], pos_x, pos_y);
            }
            else if(obj[month].dayName[day-1].equals("Sat")){

               pos_y=row*37+48;
               pos_x=533-317;
               g.drawString(" " +obj[month].dayNo[day-1], pos_x, pos_y);

               //break;
            }//if
            else if(obj[month].dayName[day-1].equals("Sun")){
            	g.setColor(Color.RED);
               pos_y=row*37+48;
               pos_x=633-380;
               g.drawString(" " +obj[month].dayNo[day-1], pos_x, pos_y);
               g.setColor(Color.BLACK);
                row++;
               if(row==6)
               row=1;
            }

            
         }  //for
         fontSize = 15;
    g.setFont(new Font("TimesRoman", Font.BOLD, fontSize));
     int xn=0;
     String weeknames[]={"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
    {
    	for(i=0; i<7;++i){
    		if(weeknames[i].equals("Sun") )
    			g.setColor(Color.RED);
    		else
    			g.setColor(Color.BLACK);
    		g.drawString(weeknames[i],33+xn,60);
    		xn+=37;
    	}
    }
    {
    	g.setColor(Color.BLACK);
    	g.drawLine(30,70,730-438,70);
	g.drawLine(30,70,30,248);
	g.drawLine(252,70,252,248);
	g.drawLine(730-438,70,730-438,248);
	g.drawLine(30,248,730-438,248);
	g.drawLine(215,70,215,248);
    //columns
	g.drawLine(68,70, 68, 248);
	g.drawLine(106, 70, 106, 248);
	g.drawLine(141, 70, 141, 248);
	g.drawLine(178, 70, 178, 248);
	//rows
	g.drawLine(30, 105, 730-438, 105);
	g.drawLine(30, 140, 730-438, 140);
	g.drawLine(30, 175, 730-438, 175);
	g.drawLine(30, 210, 730-438, 210);
    }
	g.translate(xorig+300,yorig);
   if(month%4==0){
	xorig=0;
	g.translate(-1200,yorig+240);
	}
   }//month
  }
 

   public void example(Graphics g) {

                  
	

/*Dimension d = this.getPreferredSize();
    int fontSize = 20;

    g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
     
    g.setColor(Color.red);
    
    g.drawString("www.java2s.com", 10, 20);*/

    
	/*pDC->TextOut(30, 50, _T("Monday"));
	pDC->TextOut(130, 50, _T("Tuesday"));
	pDC->TextOut(230, 50, _T("Wednesday"));
	pDC->TextOut(330, 50, _T("Thursday"));
	pDC->TextOut(430, 50, _T("Friday"));*/
	

/*//drawLine(int x1, int y1, int x2, int y2);
g.drawLine(50, 50, 150, 150);
//drawPolyline(int[] xPoints, int[] yPoints, int numPoint);
 
// Drawing primitive shapes:
//drawRect(int xTopLeft, int yTopLeft, int width, int height);
g.drawRect(80, 80, 180,180);
//drawOval(int xTopLeft, int yTopLeft, int width, int height);
g.drawOval(190, 190, 290, 290);
//drawArc(int xTopLeft, int yTopLeft, int width, int height, int startAngle, int arcAngle);
//BOOL AngleArc(   int x,   int y,   int nRadius,   float fStartAngle,   float fSweepAngle);
g.drawArc(20,20, 100, 50, 60, 120);
//draw3DRect(int xTopLeft, int, yTopLeft, int width, int height, boolean raised);
//drawRoundRect(int xTopLeft, int yTopLeft, int width, int height, int arcWidth, int arcHeight)
g.drawRoundRect(25, 50, 100, 100, 25, 50);
//drawPolygon(int[] xPoints, int[] yPoints, int numPoint);
 int[] x = new int[]{100,200,300,400};
    int[] y = new int[]{400,300,300,100};
    g.drawPolygon (x, y, x.length);    

g.setColor(Color.RED);    // set the drawing color
         g.drawLine(30, 40, 100, 200);
         g.drawOval(150, 180, 10, 10);
         g.drawRect(200, 210, 20, 30);
Color blueColor= new Color(0, 0, 255);
         //g.setColor(Color.RED);       // change the drawing color
         g.setColor(blueColor);
         g.fillOval(300, 310, 30, 50);
         g.fillRect(400, 350, 60, 50);*/
}
}

 