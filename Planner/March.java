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

public class March extends Applet{
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
    g1.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
    int monthToDisplay = 3; //change here
    example(g);
    firstPage(g, monthToDisplay);
    Object3d(g);
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
public void Object3d(Graphics g){


    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    g.translate(-30,-5);
  g.setColor(Color.BLACK);
  g.fillRect(/*x*/284,/*y*/64,292,361);
      {
        int y=70,r=0,gr=0,b=0;
        g.setColor(Color.BLACK);
        g.fillRect(/*x*/290,/*y*/y,280,80);
        y=150;
        for(int i=1;i<50;++i){
        g.setColor(new Color(r,gr,b));
        g.fillRect(/*x*/290,/*y*/y,280,4);
        y+=4;
        r+=3;gr+=3;b+=3;
        }
        g.setColor(Color.BLACK);
        int x=290;
        for(int i=1;i<40;++i){
        g.drawLine(x,y-15,x+3,y-15);
        g.drawLine(x,y-14,x+3,y-14);
        x+=7;
        }
        for(int i=1;i<19;++i){
        g.setColor(new Color(r,gr,b));
        g.fillRect(/*x*/290,/*y*/y,280,4);
        y+=4;
        r-=5;gr-=5;b-=5;
        }
      }
      {
        int xpoints[]={569,527,519,505,502,501,495,484,389,318,290,290,324,369,480,478,514,569};
        int ypoints[]={253,268,283,295,300,308,314,344,352,352,350,361,364,363,358,365,367,369};
        g.setColor(new Color(35,35,35));
        g.fillPolygon(xpoints,ypoints,xpoints.length);
        g.setColor(Color.BLACK);
        g.drawPolygon(xpoints,ypoints,xpoints.length);
      }
      //leaves
      {
        int xpoints[]={378,383,400,404,405,399,393,393,375,377,378};
        int ypoints[]={350,344,325,314,306,298,293,295,330,361,350};
        g.setColor(new Color(159,206,0));
        g.fillPolygon(xpoints,ypoints,xpoints.length);
        g.setColor(new Color(238,249,0));
        g.drawPolygon(xpoints,ypoints,xpoints.length);
      }
      {
        int xpoints[]={397,399,402,400,390,373,370,371,376,392,397};
        int ypoints[]={293,287,278,270,269,284,289,316,335,312,293};
        g.setColor(new Color(159,206,0));
        g.fillPolygon(xpoints,ypoints,xpoints.length);
        g.setColor(new Color(238,249,0));
        g.drawPolygon(xpoints,ypoints,xpoints.length);
      }
      {
        int xpoints[]={370,365,344,337,335,342,351,370,370,370};
        int ypoints[]={289,278,264,269,281,296,308,327,311,289};
        g.setColor(new Color(159,206,0));
        g.fillPolygon(xpoints,ypoints,xpoints.length);
        g.setColor(new Color(238,249,0));
        g.drawPolygon(xpoints,ypoints,xpoints.length);
      }
      {
        int xpoints[]={355,366,371,372,376,376,371,360,348,350,348,355};
        int ypoints[]={335,344,346,362,362,335,317,304,299,311,322,335};
        g.setColor(new Color(159,206,0));
        g.fillPolygon(xpoints,ypoints,xpoints.length);
        g.setColor(new Color(238,249,0));
        g.drawPolygon(xpoints,ypoints,xpoints.length);
      }

    g.setColor(Color.WHITE);
    g.setFont(new Font("Monotype Corsiva",Font.BOLD,20));
    g.drawString("\"A Person Starts To Live When",305,130);
    g.drawString("He Can Live Outside Himself\"",310,160);
    g.translate(30,5);
        g.setColor(Color.BLACK);
    g.setFont(new Font("Arial", Font.BOLD, 35));
    g.drawString("NOTE:",30,580);
    int yl=610;
    for(int i=0;i<3;i++){
      g.drawLine(30,yl,600,yl);
      yl+=30;
    }


    //MONTH NAME
    {
      int yax=170;
      g.setColor(Color.BLACK);
      g.setFont(new Font("Algerian", Font.PLAIN,40));
      for(int l=0;l<strMonth.length();++l){
      g.drawString(""+Character.toUpperCase(strMonth.charAt(l)),565,yax);
      yax+=40;
    }

    g.setColor(Color.BLACK);
    g.setFont(new Font("Times Roman", Font.BOLD,14));
    g.drawString("Muzammil",300,470);
    g.drawString("Sufyan",300,490);
    g.drawString("Hamza Ali",300,510);
    g.drawString("Basim",300,530);
    //LOGO
    {
    Image  image = getImage(getCodeBase(),
               "emblem.png");
    g.drawImage(image, 430, 440, 120, 120, this);
  }
    }
  }
}