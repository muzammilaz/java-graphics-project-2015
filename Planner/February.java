import java.applet.Applet; 
import java.awt.*; 
import javax.swing.*;

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

public class February extends Applet{
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
    int monthToDisplay = 2; //change here
    example(g);
    firstPage(g, monthToDisplay);
    Simple(g);
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
public void Simple(Graphics g){

   Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    g2.translate(60.0,-30.0);
    //colors
    Color lPink = new Color(255,191,233);
    Color dPink = new Color(255,0,187);

    //Backgroud
    g.setColor(lPink);
    g.fillRect(200,100,250,350);
    g.setColor(dPink);
    g.drawRect(200,100,250,350);
    g.drawRect(199,99,252,352);
    g.drawRect(198,98,254,354);

    //qoute
    g.setColor(dPink);
    g.setFont(new Font("Arial", Font.BOLD, 35));
    g.drawString("\"Punctuality Is",205,145);
    g.drawString("A Sign Of",250,178);
    g.drawString("Success\"",270,208);
    g.setFont(new Font("Arial", Font.BOLD, 15));
    g.drawString("(Robert William)",335,225);

    //Clock
    g2.translate(0,-30);
    //outer circle
    g.setColor(dPink);
    g.fillOval(260,300,140,140);
    g.setColor(Color.BLACK);
    g.drawOval(260,300,140,140);
    g.drawOval(259,299,142,142);

    //inner circle
    g.setColor(lPink);
    g.fillOval(270,310,120,120);
    g.setColor(Color.BLACK);
    g.drawOval(270,310,120,120);

    //small circle
    g.setColor(dPink);
    g.fillOval(325,365,10,10);
    g.setColor(Color.BLACK);
    g.drawOval(325,365,10,10);

    //times
    g.setColor(Color.BLACK);
    g.setFont(new Font("Arial", Font.BOLD,10));
    g.drawString("12",325,325);
    g.setColor(Color.BLACK);
    g.setFont(new Font("Arial", Font.BOLD,10));
    g.drawString("3",380,373);
    g.setColor(Color.BLACK);
    g.setFont(new Font("Arial", Font.BOLD,10));
    g.drawString("6",328,425);
    g.setColor(Color.BLACK);
    g.setFont(new Font("Arial", Font.BOLD,10));
    g.drawString("9",275,373);

    //pins
    g.drawLine(330,370,370,350);
    g.drawLine(330,370,310,350);
    int[] x={362,366,371,362};
    int[] y={350,358,350,350};
    g.fillPolygon(x,y,4);
    int[] x1={307,313,305,307};
    int[] y1={353,347,345,353};
    g.fillPolygon(x1,y1,4);
     g2.translate(0,-30);
    g2.translate(-60.0,30.0);


    //MONTH NAME
    {    
      g.setColor(Color.BLACK);
    g.setFont(new Font("Arial", Font.BOLD, 35));
    g.drawString("NOTE:",30,640);
    int yl=670;
    for(int i=0;i<3;i++){
      g.drawLine(30,yl,560,yl);
      yl+=30;
    } 
      int yax=180;
      g.setColor(dPink);
      g.setFont(new Font("Algerian", Font.PLAIN,40));
      for(int l=0;l<strMonth.length();++l){
      g.drawString(""+Character.toUpperCase(strMonth.charAt(l)),525,yax);
      yax+=40;
    }

    g.setColor(Color.BLACK);
    g.setFont(new Font("Times Roman", Font.BOLD,14));
    g.drawString("Muzammil",300,535);
    g.drawString("Sufyan",300,555);
    g.drawString("Hamza Ali",300,575);
    g.drawString("Basim",300,595);

    {
      Image  image = getImage(getCodeBase(),"emblem.png");
      g.drawImage(image, 420, 500, 120, 120, this);
    }
    }
  }
}