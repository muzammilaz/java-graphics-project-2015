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

public class May extends Applet{
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
    int monthToDisplay = 5; //change here
    example(g);
    firstPage(g, monthToDisplay);
    Building(g);
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
public void Building(Graphics g){
    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    AffineTransform tr=new AffineTransform();
    tr.scale(0.8,0.8);
    g2.setTransform(tr);
    g2.translate(280.0,60.0);
    //Colors 
    Color brown = new Color(212,188,144);
    Color orangeT = new Color(242,146,78);
    Color greenF = new Color(71,212,36);
    Color greenFB = new Color(179,232,182);
    Color orangeFB = new Color(214,115,15);

    //frame and background
    g.setColor(orangeFB);
    g.fillRect(30,30,440,430);
    g.setColor(Color.BLACK);
    g.drawRect(30,30,440,430);
    g.drawRect(29,29,442,432);
    g.drawRect(28,28,444,434);
    g.setColor(greenFB);
    g.fillRect(50,50,400,390);
    g.setColor(Color.BLACK);
    g.drawRect(50,50,400,390);
    g.drawRect(49,49,402,392);

    //1st pillar with outline
    g.setColor(brown);
    g.fillRect(100,200,30,200);
    g.setColor(Color.BLACK);
    g.drawRect(100,200,30,200);
    g.drawRect(99,199,32,202);
    g.setColor(Color.WHITE);
    g.fillRect(110,230,10,20);
    g.setColor(Color.BLACK);
    g.drawRect(110,230,10,20);
    g.drawRect(109,229,12,22);

    //1st triangle 
    int[] x={99,131,115,99};
    int[] y={199,199,170,199};
    g.setColor(orangeT);
    g.fillPolygon(x,y,4);
    g.setColor(Color.BLACK);
    g.drawPolygon(x,y,4);

    //1st triangle outline
    int[] x1={100,130,116,100};
    int[] y1={198,198,170,198};
    g.drawPolygon(x1,y1,4);
    int[] x2={101,131,116,101};
    int[] y2={199,198,169,199};
    g.drawPolygon(x2,y2,4);

    //1st Flag
    g.drawLine(116,169,116,129);
    g.drawLine(115,169,115,129);
    g.setColor(greenF);
    g.fillRect(85,129,29,20);
    g.setColor(Color.BLACK);
    g.drawRect(85,129,29,20);
    g.drawRect(84,128,31,22);

    //the bigger box with outline
    g.setColor(brown);
    g.fillRect(131,260,250,140);
    g.setColor(Color.BLACK);
    g.drawRect(131,260,250,140);
    g.drawRect(130,259,252,142);

    //white boxes
    int a1=131,a2=272;
    for(int i=0;i<6;i++){
      g.setColor(Color.WHITE);
      g.fillRect(a1,248,7,10);
      g.fillRect(a2,248,7,10);
      g.setColor(Color.BLACK);
      g.drawRect(a1,248,7,10);
      g.drawRect(a1-1,247,9,12);
      g.drawRect(a2,248,7,10);
      g.drawRect(a2-1,247,9,12);
      a1+=20;
      a2+=20;
    }

    //Door
    g.setColor(Color.WHITE);
    g.fillArc(230,300,60,70,0,180);
    g.fillRect(230,335,60,65);
    g.setColor(Color.BLACK);
    g.drawArc(230,300,60,70,0,180);
    g.drawArc(229,299,62,72,0,180);
    g.drawRect(230,335,60,65);
    g.drawRect(229,334,62,67);
    /*g.setColor(Color.WHITE);
    g.drawLine(231,335,290,335);
    g.drawLine(231,334,290,334);*/
    g.setColor(Color.BLACK);
    g.drawLine(240,309,240,400);
    g.drawLine(250,301,250,400);
    g.drawLine(260,301,260,400);
    g.drawLine(270,303,270,400);
    g.drawLine(280,309,280,400);
    g.setColor(Color.BLACK);
    g.fillOval(233,359,5,5);

    //2nd pillar with outline
    g.setColor(brown);
    g.fillRect(240,169,30,90);
    g.setColor(Color.BLACK);
    g.drawRect(240,169,30,90);
    g.drawRect(239,168,32,92);
    g.setColor(Color.WHITE);
    g.fillRect(250,199,10,20);
    g.setColor(Color.BLACK);
    g.drawRect(250,199,10,20);
    g.drawRect(249,198,12,22);

    //2rd triangle
    int[] x3={239,271,255,239};
    int[] y3={168,168,140,168};
    g.setColor(orangeT);
    g.fillPolygon(x3,y3,4);
    g.setColor(Color.BLACK);
    g.drawPolygon(x3,y3,4);

    //2nd triangle outline
    int[] x8={240,270,256,240};
    int[] y8={167,167,140,167};
    g.drawPolygon(x8,y8,4);
    int[] x9={241,271,256,241};
    int[] y9={167,167,139,167};
    g.drawPolygon(x9,y9,4);

    //2nd Flag
    g.drawLine(256,143,256,103);
    g.drawLine(255,143,255,103);
    g.setColor(greenF);
    g.fillRect(225,103,29,20);
    g.setColor(Color.BLACK);
    g.drawRect(225,103,29,20);
    g.drawRect(224,102,31,22);

    //3rd pillar with outline
    g.setColor(brown);
    g.fillRect(383,200,30,200);
    g.setColor(Color.BLACK);
    g.drawRect(382,200,30,200);
    g.drawRect(381,199,32,202);
    g.setColor(Color.WHITE);
    g.fillRect(393,230,10,20);
    g.setColor(Color.BLACK);
    g.drawRect(393,230,10,20);
    g.drawRect(392,229,12,22);

    //3rd triangle
    int[] x5={381,412,397,381};
    int[] y5={199,199,170,199};
    g.setColor(orangeT);
    g.fillPolygon(x5,y5,4);
    g.setColor(Color.BLACK);
    g.drawPolygon(x5,y5,4);

    //3nd triangle outline
    int[] x6={382,411,398,382};
    int[] y6={198,198,170,198};
    g.drawPolygon(x6,y6,4);
    int[] x7={383,412,398,383};
    int[] y7={199,198,169,199};
    g.drawPolygon(x7,y7,4);

    //1st Flag
    g.drawLine(398,170,398,130);
    g.drawLine(397,170,397,130);
    g.setColor(greenF);
    g.fillRect(367,130,29,20);
    g.setColor(Color.BLACK);
    g.drawRect(367,130,29,20);
    g.drawRect(366,129,31,22);

    g2.translate(-280.0,-60.0);
    GraphicsConfiguration gc = g2.getDeviceConfiguration();
    g2.setTransform(gc.getDefaultTransform());


    g.setColor(Color.BLACK);
    g.setFont(new Font("Arial", Font.BOLD, 35));
    g.drawString("NOTE:",30,580);
    int yl=610;
    for(int i=0;i<3;i++){
      g.drawLine(30,yl,620,yl);
      yl+=30;
    }


    //MONTH NAME
    {
      int yax=210;
      g.setColor(greenF);
      g.setFont(new Font("Algerian", Font.PLAIN,40));
      for(int l=0;l<strMonth.length();++l){
      g.drawString(""+Character.toUpperCase(strMonth.charAt(l)),620,yax);
      yax+=40;
    }

    g.setColor(Color.BLACK);
    g.setFont(new Font("Times Roman", Font.BOLD,14));
    g.drawString("Muzammil",340,470);
    g.drawString("Sufyan",340,490);
    g.drawString("Hamza Ali",340,510);
    g.drawString("Basim",340,530);
    //LOGO
    {
    Image  image = getImage(getCodeBase(),
               "emblem.png");
    g.drawImage(image, 490, 440, 120, 120, this);
  }
    }
  }
}