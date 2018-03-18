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

public class August extends Applet{
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
    int monthToDisplay = 8; //change here
    example(g);
    firstPage(g, monthToDisplay);
    rickshaw(g);
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
public void rickshaw(Graphics g){
    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);

      //colors
    Color lOrange = new Color(245,208,61);
    Color dOrange = new Color(235,163,25);
    Color dOrange1 = new Color(235,115,32);
    Color lYellow = new Color(240,220,63);
    Color lGreen = new Color(0,200,110);
    Color dGreen = new Color(20,120,85);
    Color dGreen1 = new Color(25,145,98);
    Color dGreen2 = new Color(40,133,102);
    Color dRed = new Color(207,82,48);
    Color dRed1 = new Color(145,30,35);
    Color dBlue = new Color(96,0,199);
    Color lPurple = new Color(120,120,150);
    Color lPurple1 = new Color(57,57,94);
    Color dPurple = new Color(105,105,135);
    Color dPurple1 = new Color(80,78,138);
    Color dPurple2 = new Color(33,33,60);
    
    g.translate(250,70);

    g.setColor(dRed);
    g.fillRect(0,0,400,250);
    g.setColor(dPurple1);
    g.fillRect(0,250,400,100);
    g.setColor(Color.BLACK);
    g.drawRect(0,0,400,350);
    g.drawRect(-1,-1,402,352);
    int x=20;
    for(int i=0;i<3;i++){
      g.setColor(lPurple1);
      g.fillRect(x,300,100,10);
      x+=120;
    }

    //signal
    g.setColor(dPurple2);
    g.fillRect(50,200,15,50);
    g.fillRect(55,100,5,100);
    g.fillRect(45,40,25,60);
    g.fillArc(45,30,25,25,0,180);
    g.setColor(dPurple1);
    g.fillRect(50,200,15,3);
    g.fillRect(45,100,25,5);
    g.setColor(dRed1);
    g.fillOval(49,35,17,17);
    g.setColor(lYellow);
    g.fillOval(49,55,17,17);
    g.setColor(lGreen);
    g.fillOval(49,75,17,17);

    g.translate(20,0);

    //front wheel
    g.setColor(Color.BLACK);
    g.fillOval(85,238,53,53);
    g.setColor(lPurple);
    g.fillOval(95,248,33,33);
    g.setColor(dPurple);
    g.fillOval(100,253,23,23);
    g.setColor(dGreen);
    g.fillArc(75,225,75,70,0,180);

    //body(front and middle)
    g.setColor(lOrange);
    g.fillArc(100,100,110,160,90,90);
    g.setColor(lGreen);
    g.fillArc(100,100,110,160,180,90);
    g.setColor(lGreen);
    g.fillRect(155,115,180,145);
    g.setColor(dGreen2);
    g.fillRect(100,180,60,3);

    g.setColor(dRed);
    g.fillRect(155,115,50,100);
    g.fillRect(155,215,40,40);
    int[] xm = {190,205,190,190};
    int[] ym = {255,255,245,255};
    g.fillPolygon(xm,ym,4);
    g.setColor(dBlue);
    g.fillRect(185,203,20,12);
    g.fillArc(180,203,10,12,90,180);
    g.fillArc(196,160,18,25,90,180);

    g.setColor(dRed);
    g.fillRect(210,115,60,130);
    g.setColor(lGreen);
    g.fillRoundRect(250,195,85,65,20,30);
    g.setColor(dBlue);
    g.fillRect(235,203,15,12);
    g.fillArc(230,203,10,12,90,180);

    g.setColor(dGreen1);
    int y=205;
    for(int i=0;i<4;i++){
      g.fillRect(255,y,80,2);
      y+=12;
    }

    //headlight and indicators
    g.setColor(Color.BLACK);
    g.fillArc(65,204,35,30,90,-180);
    g.setColor(dOrange);
    g.fillRect(80,204,5,30);
    g.setColor(dGreen2);
    g.fillRect(110,190,12,10);
    g.setColor(dOrange1);
    g.fillRect(110,190,10,10);
    g.fillRect(325,195,10,10);

    //2nd wheel
    g.setColor(dGreen);
    g.fillArc(270,230,65,60,0,180);
    g.setColor(Color.BLACK);
    g.fillOval(278,238,50,50);
    g.setColor(lPurple);
    g.fillOval(288,248,30,30);
    g.setColor(dPurple);
    g.fillOval(293,253,20,20);

    g.setColor(lOrange);
    int[] tx = {270,335,270,270};
    int[] ty = {195,195,115,195};
    g.fillPolygon(tx,ty,4);

    g.setColor(Color.BLACK);
    g.fillArc(125,70,50,30,-180,180);

    g.setColor(dOrange);
    g.fillRect(155,85,150,30);
    g.fillArc(270,85,65,60,0,90);
    int[] tx1 = {270,335,335,270};
    int[] ty2 = {115,115,195,115};
    g.fillPolygon(tx1,ty2,4);

    g.setColor(lYellow);
    g.fillRect(155,112,140,3);
    g.fillArc(270,112,45,50,0,90);
    g.setColor(dOrange);
    g.fillArc(270,115,42,50,0,90);
    g.setColor(lYellow);
    g.fillRect(312,135,23,3);

    //windshield
    g.translate(-199,-103);
    g.translate(-70,0);
    GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
    path.moveTo(369.0f,282.0f);
    path.quadTo(365,238,402,210);
    path.quadTo(415,275,369,282);
    path.closePath();
    g.setColor(Color.WHITE);
    g2.fill(path);

    g.translate(199,103);
    g.translate(70,0);
    g.translate(-20,0);
    g.translate(-250,-70);


    //MONTH NAME
    { 
      g.setColor(Color.BLACK);
      g.setFont(new Font("Arial", Font.BOLD, 35));
      g.drawString("NOTE:",30,580);
      int yl=610;
      for(int i=0;i<3;i++){
      g.drawLine(30,yl,660,yl);
      yl+=30;
    }
      int yax=160;
      g.setColor(dRed);
      g.setFont(new Font("Algerian", Font.PLAIN,40));
      for(int l=0;l<strMonth.length();++l){
      g.drawString(""+Character.toUpperCase(strMonth.charAt(l)),665,yax);
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
    g.drawImage(image, 535, 440, 120, 120, this);
  }
    }
  }
}