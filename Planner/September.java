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

public class September extends Applet{
  static String strMonth="";
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
    g1.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    int monthToDisplay = 9; //change here
    example(g);
    firstPage(g, monthToDisplay);
    drawUmbrella(g);
  }


   public void firstPage(Graphics g, int monthToDisplay) {
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
    }//for outer
    int i;
 

     int row=1;
     int col=0;
     int pos_x, pos_y;//pos_y=row*70+3; pos_x=col*100+33
    
     month=monthToDisplay;
   
	
      int fontSize = 24;
      g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
      g.setColor(Color.BLACK);
      strMonth = obj[month].monthName;
      g.drawString(strMonth, 30, 30);
      fontSize = 14;
      g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
      g.setColor(Color.BLACK);
      for ( day = 1; day <= daysInMonths[month]; day++ )
         {   
            if(obj[month].dayName[day-1].equals("Sat")){
               pos_y=row*70+12;
               pos_x=33;
               g.drawString(" " +obj[month].dayNo[day-1], pos_x, pos_y);
               //break;
            }//if
            else if(obj[month].dayName[day-1].equals("Sun")){
               pos_y=row*70+12;
               pos_x=133;
               g.drawString(" " +obj[month].dayNo[day-1], pos_x, pos_y);
                row++;
               if(row==6)
               row=1;
            }
       }//for
   //Calendar in SMALL FONTS
       String strMonth1="";
       String strMonth2 = "";
       int month2=-1;
if(month==12){//display Jan 2017
 //Sample values for first month i.e January 2017
     obj[1].monthName="January";
     obj[1].dayName[1]="Sun";
     obj[1].dayNo[0]=1;
     dayNameIndex=6;

     
        dayNameEntireMonth1 = new String[31];
        for(day=1; day<= daysInMonths[month]; ++day) {
           dayNameEntireMonth1[day-1]= dayName[dayNameIndex];
           dayNo1[day-1] = day;
           dayNameIndex++;
           if(dayNameIndex==7)
              dayNameIndex=0;
    
     }
         obj[1] = new Calendar(months[month], dayNameEntireMonth1, dayNo1);
      month--;
      strMonth1=obj[month].monthName;
      month2 = 1;
       strMonth2= "January 2017";
       
 }//if(month==12)
  else if (month == 1) { //display DEC 2015
//Sample values for first month i.e DEC 15
      obj[12].monthName = "December ";
      obj[12].dayName[0] = "Tue";
      obj[12].dayNo[0] = 1;
      dayNameIndex = 1;
        dayNameEntireMonth1 = new String[31];
        for (day = 1; day <= daysInMonths[month]; ++day) {
          dayNameEntireMonth1[day - 1] = dayName[dayNameIndex];
          dayNo1[day - 1] = day;
          dayNameIndex++;
          if (dayNameIndex == 7)
            dayNameIndex = 0;

        }
        obj[12] = new Calendar(months[month], dayNameEntireMonth1, dayNo1);

        month = 12;         
        strMonth1 = "December 2015";
        month2 = 2;
        strMonth2  = obj[month2].monthName;
    }//if(month==12)
  else{
        month2 = month + 1;
        month--;
        strMonth1 = obj[month].monthName;
        strMonth2  = obj[month2].monthName;
      }

 row = 1;
 col = 0;
 int rowInc=0;
 {
     //Font for month name; small fonts calendar
    fontSize = 9;
    g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
    g.setColor(Color.BLACK);
    
      g.drawString(strMonth1, 30, 455);
      g.drawString(strMonth2, 150, 455);
      //day letters
      int x = 33;
      for (int l = 0; l < dayName.length; ++l) {
        String s = "" + dayName[l].charAt(0);
        g.setColor(Color.RED);
        g.drawString(s, x, 470);
        x += 15;
      }
      x = 153;
      for (int l = 0; l < dayName.length; ++l) {
        String s = "" + dayName[l].charAt(0);
        g.drawString(s, x, 470);
        x += 15;
      }
      g.setColor(Color.BLACK);
      for ( day = 1; day <= daysInMonths[month]; day++ )
         {   
             if(obj[month].dayName[day-1].equals("Mon")){
                   pos_y=485+rowInc;
                   pos_x=30;
                   g.drawString(" " +obj[month].dayNo[day-1], pos_x, pos_y);
                   //break;
               }//if
               else if(obj[month].dayName[day-1].equals("Tue")){
                   pos_y=485+rowInc;;
                   pos_x=45;
                   g.drawString(" " +obj[month].dayNo[day-1], pos_x, pos_y);
               }
               else if(obj[month].dayName[day-1].equals("Wed")){
                          pos_y=485+rowInc;;
                          pos_x=60;
                         g.drawString(" " +obj[month].dayNo[day-1], pos_x, pos_y);
               }
               else if(obj[month].dayName[day-1].equals("Thu")){
                     pos_y=485+rowInc;;
                     pos_x=75;
                     g.drawString(" " +obj[month].dayNo[day-1], pos_x, pos_y);
               }
               else if(obj[month].dayName[day-1].equals("Fri")){
                     pos_y=485+rowInc;;
                     pos_x=90;
                     g.drawString(" " +obj[month].dayNo[day-1], pos_x, pos_y);
                }
                else if(obj[month].dayName[day-1].equals("Sat")){
                     pos_y=485+rowInc;;
                     pos_x=105;
                     g.drawString(" " +obj[month].dayNo[day-1], pos_x, pos_y);
                }
               else if(obj[month].dayName[day-1].equals("Sun")){
                     pos_y=485+rowInc;;
                     pos_x=120;
                     g.drawString(" " +obj[month].dayNo[day-1], pos_x, pos_y);
                     row++;
                     rowInc= rowInc+10;
                     if(row==6){
	      row=1;
	      rowInc=0;
                     }
                }//else if
            }//for 
          }
          row = 1;
 col = 0;
 rowInc=0;
 {
for ( day = 1; day <= daysInMonths[month2]; day++ )
         {   
             if(obj[month2].dayName[day-1].equals("Mon")){
                   pos_y=485+rowInc;
                   pos_x=150;
                   g.drawString(" " +obj[month2].dayNo[day-1], pos_x, pos_y);
                   //break;
               }//if
               else if(obj[month2].dayName[day-1].equals("Tue")){
                   pos_y=485+rowInc;;
                   pos_x=165;
                   g.drawString(" " +obj[month2].dayNo[day-1], pos_x, pos_y);
               }
               else if(obj[month2].dayName[day-1].equals("Wed")){
                          pos_y=485+rowInc;;
                          pos_x=180;
                         g.drawString(" " +obj[month2].dayNo[day-1], pos_x, pos_y);
               }
               else if(obj[month2].dayName[day-1].equals("Thu")){
                     pos_y=485+rowInc;;
                     pos_x=195;
                     g.drawString(" " +obj[month2].dayNo[day-1], pos_x, pos_y);
               }
               else if(obj[month2].dayName[day-1].equals("Fri")){
                     pos_y=485+rowInc;;
                     pos_x=210;
                     g.drawString(" " +obj[month2].dayNo[day-1], pos_x, pos_y);
                }
                else if(obj[month2].dayName[day-1].equals("Sat")){
                     pos_y=485+rowInc;;
                     pos_x=225;
                     g.drawString(" " +obj[month2].dayNo[day-1], pos_x, pos_y);
                }
               else if(obj[month2].dayName[day-1].equals("Sun")){
                     pos_y=485+rowInc;;
                     pos_x=240;
                     g.drawString(" " +obj[month2].dayNo[day-1], pos_x, pos_y);
                     row++;
                     rowInc= rowInc+10;
                     if(row==6){
        row=1;
        rowInc=0;
                     }
                }//else if
            }//for 
    }//block rowInc
     
  }
 

public void example(Graphics g) {

  g.drawLine(30, 70, 230, 70);
  g.drawLine(30, 70, 30, 420);
  g.drawLine(30, 420, 230, 420);
  g.drawLine(230, 420, 230, 70);

  g.drawLine(130, 70, 130, 420);
  //columns
  g.drawLine(30, 140, 230, 140);
  g.drawLine(30, 210, 230, 210);
  g.drawLine(30, 280, 230, 280);
  g.drawLine(30, 350, 230, 350);
  //rows
  /*g.drawLine(270, 70, 270, 420);
  g.drawLine(270, 420, 530, 420);
  g.drawLine(270, 70, 530, 70);
  g.drawLine(530, 70, 530, 420);*/




  int fontSize = 20;

  g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));

  g.setColor(Color.red);
  g.drawString("Saturday", 30, 50);
  g.drawString("Sunday", 130, 50);
  /*g.drawString("Wednesday", 230, 50);
  g.drawString("Thursday",330, 50);
  g.drawString("Friday", 430, 50);*/
}
public void drawUmbrella(Graphics g){
      Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(Color.BLACK);
        g.fillRect(255,70,350,350);
        g.setColor(new Color(251,209,61));
        g.fillRect(270,85,320,320);
            //colors
    Color gray = new Color(63,63,63);
    Color yellow = new Color(251,209,61);
    g2.translate(230 ,230);
    g2.scale(0.36,0.36);
    //background
    /*g.setColor(yellow);
    g.fillRect(140,60,600,400);*/
    //head
    g.setColor(Color.BLACK);
    g.fillArc(200,100,180,150,0,180);

    //body
    g.setColor(gray);
    g.fillRoundRect(200,180,180,150,30,40);
    g.fillRect(200,180,180,50);

    //hands
    g.fillRect(150,200,40,40);
    g.fillRect(390,200,40,40);
    g.fillArc(390,180,40,40,0,180);
    g.fillArc(150,180,40,40,0,180);
    g.setColor(Color.BLACK);
    g.fillRect(150,240,40,30);
    g.fillRect(390,240,40,30);
    g.fillArc(150,250,40,40,0,-180);
    g.fillArc(390,250,40,40,0,-180);

    //legs
    g.setColor(gray);
    g.fillRect(230,330,40,70);
    g.fillRect(310,330,40,70);
    g.fillArc(230,385,40,30,0,-180);
    g.fillArc(310,385,40,30,0,-180);

    //eyes
    g.setColor(Color.WHITE);
    g.fillArc(240,125,18,18,-35,-180);
    g.fillArc(320,125,18,18,35,-180);

    //antena :D
    g.setColor(Color.BLACK);
    int[] a1x = {230,250,245,225,230};
    int[] a1y = {80,110,115,85,80};
    g.fillPolygon(a1x,a1y,5);
    g.fillArc(225,80,6,6,45,180);
    
    int[] a2x = {350,330,325,345,350};
    int[] a2y = {80,110,105,75,80};
    g.fillPolygon(a2x,a2y,5);
    g.fillArc(345,75,6,6,-45,180);

    //belt
    g.setColor(yellow);
    g.fillRect(200,280,180,10);
    g.fillRect(270,275,40,20);

    //FLASH
    Color red = new Color(191,0,0);

    //head
    g.translate(550,0);
    g.setColor(red);
    g.fillArc(200,100,180,150,0,180);

    //body
    g.setColor(red);
    g.fillRoundRect(200,180,180,150,30,40);
    g.fillRect(200,180,180,50);

    //hands
    g.fillRect(150,200,40,40);
    g.fillRect(390,200,40,40);
    g.fillArc(390,180,40,40,0,180);
    g.fillArc(150,180,40,40,0,180);
    g.setColor(red);
    g.fillRect(150,240,40,30);
    g.fillRect(390,240,40,30);
    g.fillArc(150,250,40,40,0,-180);
    g.fillArc(390,250,40,40,0,-180);
    g.setColor(yellow);
    g.fillRect(150,220,40,10);
    g.fillRect(390,220,40,10);

    //legs
    g.setColor(red);
    g.fillRect(230,330,40,70);
    g.fillRect(310,330,40,70);
    g.fillArc(230,385,40,30,0,-180);
    g.fillArc(310,385,40,30,0,-180);

    //eyes
    g.setColor(Color.WHITE);
    g.fillOval(245,135,20,20);
    g.fillOval(315,135,20,20);

    //antena :D
    g.setColor(red);
    int[] a3x = {230,250,245,225,230};
    int[] a3y = {80,110,115,85,80};
    g.fillPolygon(a3x,a3y,5);
    g.fillArc(225,80,6,6,45,180);
    
    int[] a4x = {350,330,325,345,350};
    int[] a4y = {80,110,105,75,80};
    g.fillPolygon(a4x,a4y,5);
    g.fillArc(345,75,6,6,-45,180);

    //belt
    g.setColor(yellow);
    g.fillRect(200,280,180,10);
    g.fillRect(270,275,40,20);

    //g.rotate(-12,338.0,168.0);
          //Cloak
    GraphicsConfiguration gc = g2.getDeviceConfiguration();
    g2.setTransform(gc.getDefaultTransform());
    {
      g.setColor(new Color(215,30,69));
            GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
          path.moveTo(419,205);
        path.quadTo(416.5,243.0,377.0,271.0);
        path.quadTo(415.0,353.5,463.0,324.0);
        path.quadTo(492.5,290.0,474.0,204.0);
        path.lineTo(419,205);
        path.closePath();
          g2.fill(path);
    }
          //Head And Body
          {
            GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
          g.setColor(new Color(133,197,65));
          g.fillArc(417,167,58,60,0,180);
        path.moveTo(417,203);
        path.quadTo(418.5,230.0,411.0,244.5);
        path.quadTo(408.0,251.5,415.0,251.0);
        path.lineTo(464.0,256.0);
        path.quadTo(469.5,259.0,468.5,250.0);
        path.quadTo(475.5,232.5,475.5,203.0);
        path.lineTo(417,203);
          path.closePath();
          g2.fill(path);
          }
          {
            GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path.moveTo(403.5,206);
        path.quadTo(403.0,224.5,383.5,229.5);
        path.quadTo(379.0,233.0,382.5,237.5);
        path.quadTo(384.5,242.0,388.5,240.0);
        path.quadTo(411.5,232.5,414.5,209.0);
        path.quadTo(414.0,203.0,409.0,204.0);
        path.quadTo(406.0,201.0,403.5,206.0);
          path.closePath();
          g2.fill(path);
          }
          //Other Hand
        {
        AffineTransform transformer = new AffineTransform();
    
    transformer.rotate(60,245.0,219.0);
    transformer.scale(-1,-1);
    g2.setTransform(transformer); 
    g2.translate(-405,-535);
      GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path.moveTo(403.5,206);
        path.quadTo(403.0,224.5,383.5,229.5);
        path.quadTo(379.0,233.0,382.5,237.5);
        path.quadTo(384.5,242.0,388.5,240.0);
        path.quadTo(411.5,232.5,414.5,209.0);
        path.quadTo(414.0,203.0,409.0,204.0);
        path.quadTo(406.0,201.0,403.5,206.0);
          path.closePath();
          g2.fill(path);
        }
        {
        AffineTransform transformer = new AffineTransform();
           transformer.scale(1.0, 1.0);
    g2.setTransform(transformer);
     g2.translate(45,44);

        GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path.moveTo(403.5,206);
        path.quadTo(403.0,224.5,383.5,229.5);
        path.quadTo(379.0,233.0,382.5,237.5);
        path.quadTo(384.5,242.0,388.5,240.0);
        path.quadTo(411.5,232.5,414.5,209.0);
        path.quadTo(414.0,203.0,409.0,204.0);
        path.quadTo(406.0,201.0,403.5,206.0);
          path.closePath();
          g2.fill(path);

      }
      {
         g2.translate(-30,-8);
        GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path.moveTo(403.5,206);
        path.quadTo(403.0,224.5,383.5,229.5);
        path.quadTo(379.0,233.0,382.5,237.5);
        path.quadTo(384.5,242.0,388.5,240.0);
        path.quadTo(411.5,232.5,414.5,209.0);
        path.quadTo(414.0,203.0,409.0,204.0);
        path.quadTo(406.0,201.0,403.5,206.0);
          path.closePath();
          g2.fill(path);
      }
      g2.translate(-15,-36);
          g.setColor(Color.WHITE);
          g.fillRect(415,202,60,5);
          g.fillRect(506,152,4,70);
          
          g.setColor(Color.RED);
          g.fillOval(480,100,60,60);
          {
        g.setColor(new Color(215,30,69));
        int x=480,y=100,d=60;
        int m=0,n=0;
        double t=0.0;
      g.fillOval(x,y,d,d);
      
        for(int i=0;i<6;++i){
        GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path.moveTo(x+(d/2),y+(d/2));
        path.quadTo(x+d/2+28,y+14,(x+d)-7,(y+d/2)+26);
        path.quadTo(x+d/2+26,y+30,x+(d/2),y+(d/2));
          path.closePath();
        AffineTransform transformer=new AffineTransform();
          transformer.setToRotation(t+=19.9, x+(d/2), y+(d/2));
          g2.setTransform(transformer);
        
          n+=14;
          m+=5;
          
          
          g.setColor(Color.WHITE);          
           g2.fill(path);
      }
    }
    //eyes
          {
            g.setColor(Color.WHITE);
            g.fillOval(430,185,8,8);
            g.fillOval(460,185,8,8);
          }
          
          //ears
          {
    
    g2.rotate(6,446.5,184.5);
    //g2.setTransform(transformer);

    g2.translate(212,50);
    g2.scale(0.65,0.65);
            g.setColor(new Color(133,197,65));
            g.fillRect(338,165,6,30);
}
    g2.translate(-212,-50);
     g2.rotate(-6,446.5,184.5);
 //   GraphicsConfiguration gc = g2.getDeviceConfiguration();
   //   g2.setTransform(gc.getDefaultTransform());
{
   g2.rotate(-6,446.5,184.5);
  g2.translate(270,-34);
            g.setColor(new Color(133,197,65));
            g.fillRect(338,165,6,30);
}
g2.rotate(6,446.5,184.5);

    g2.scale(1.54,1.54);

    g2.scale(0.53,0.53);
    g2.translate(25,5);
//cloak stuff

          {

        g.setColor(new Color(215,30,69));
            g.fillRect(310,246,114,10);
            int xp[]={355,375,365,355};
            int yp[]={250,250,270,250};
            g.fillPolygon(xp,yp,xp.length);
          }

    //MONTH NAME
    { 
      GraphicsConfiguration gc1 = g2.getDeviceConfiguration();
    g2.setTransform(gc1.getDefaultTransform());

      g.setColor(Color.BLACK);
      g.setFont(new Font("Arial", Font.BOLD, 35));
      g.drawString("NOTE:",30,580);
      int yl=610;
      for(int i=0;i<3;i++){
      g.drawLine(30,yl,660,yl);
      yl+=30;
    }
      int yax=100;
      g.setColor(Color.BLACK);
      g.setFont(new Font("Algerian", Font.PLAIN,40));
      for(int l=0;l<strMonth.length();++l){
      g.drawString(""+Character.toUpperCase(strMonth.charAt(l)),620,yax);
      yax+=40;
    }

    g.setColor(Color.BLACK);
    g.setFont(new Font("Times Roman", Font.BOLD,14));
    g.drawString("Muzammil",320,470);
    g.drawString("Sufyan",320,490);
    g.drawString("Hamza Ali",320,510);
    g.drawString("Basim",320,530);

    //LOGO
    {
    Image  image = getImage(getCodeBase(),
               "emblem.png");
    g.drawImage(image, 490, 440, 120, 120, this);
  }
    }
  }
}