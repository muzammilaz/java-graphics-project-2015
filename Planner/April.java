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

public class April extends Applet{
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
    int monthToDisplay = 4; //change here
    example(g);
    firstPage(g, monthToDisplay);
    jf17(g);
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
public void jf17(Graphics g){

  Graphics2D g2 = (Graphics2D) g;
  g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
  g.setColor(new Color(242,108,79));
  g.fillRect(/*x*/255,/*y*/70,370,350);
  g.setColor(new Color(156,188,223));
  g.fillRect(265,80,350,180);
    int x=265,y=260,r=156,gr=188,b=223;
  for(int i=1;i<31;++i){
    g.setColor(new Color(r,gr,b));
    g.fillRect(x,y,350,5);
    y+=5;
    r-=4;
    gr-=4;
    b-=3;
  }
  g.setColor(Color.BLACK);
  g.drawRect(265,80,350,330);
  g.drawRect(255,70,370,350);
    //HEAD
    {
      g.setColor(new Color(137,149,153));
      int xpoints[]={337,354,370,394,418,401,337};
      int ypoints[]={177,171,172,177,188,217,177};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    // 1
    {
      g.setColor(new Color(88,92,97));
      int xpoints[]={278,326,421,418,369,363,320,291,278};
      int ypoints[]={182,185,202,215,201,205,196,187,182};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //2
    {
      g.setColor(new Color(65,79,95));
      int xpoints[]={538,543,573,597,572,585,585,588,588,585,585,566,573,548,526,538};
      int ypoints[]={205,199,180,187,226,230,232,232,234,234,240,236,241,237,227,205};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //3
    {
      g.setColor(new Color(72,75,80));
      int xpoints[]={416,415,411,380,383,383,394,445,440,416};
      int ypoints[]={234,239,242,235,229,222,206,222,243,234};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //4
    {
      g.setColor(new Color(100,105,108));
      int xpoints[]={517,509,560,563,574,577,517};
      int ypoints[]={232,235,246,247,249,246,232};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //5
    {
      g.setColor(new Color(123,110,98));
      int xpoints[]={561,566,567,567,566,573,578,574,571,561};
      int ypoints[]={263,258,254,250,247,247,248,260,263,263};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //6
    {
      g.setColor(new Color(55,55,52));
      int xpoints[]={568,573,574,575,586,585,582,568};
      int ypoints[]={263,257,253,247,247,257,263,263};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //7
    {
      g.setColor(new Color(85,85,83));
      int xpoints[]={510,499,495,526,529,545,546,553,553,565,565,572,510};
      int ypoints[]={235,247,253,260,270,274,274,273,272,263,262,248,235};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //8
    {
      g.setColor(new Color(90,98,107));
      int xpoints[]={494,490,476,461,462,460,410,410,433,427,428,474,529,530,519,517,494};
      int ypoints[]={268,252,249,256,258,259,248,246,250,244,238,243,252,262,263,269,268};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //9
    {
      g.setColor(new Color(58,61,65));
      int xpoints[]={418,419,510,495,527,527,519,517,494,490,481,423,418};
      int ypoints[]={214,209,236,253,260,262,263,270,269,252,245,236,214};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //10
    {
      g.setColor(new Color(154,148,135));
      int xpoints[]={461,459,435,422,424,435,437,461};
      int ypoints[]={244,254,250,242,236,240,239,244};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //11
    {
      g.setColor(new Color(168,165,148));
      int xpoints[]={442,437,455,474,474,442};
      int ypoints[]={222,237,242,245,239,222};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //12
    {
      g.setColor(new Color(42,48,48));
      int xpoints[]={442,447,446,446,444,446,446,446,438,442};
      int ypoints[]={229,231,234,234,235,237,238,238,235,229};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //13
    {
      g.setColor(new Color(79,92,105));
      int xpoints[]={517,526,553,555,517};
      int ypoints[]={232,226,239,243,232};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //14
    {
      g.setColor(new Color(88,93,93));
      int xpoints[]={557,554,582,593,604,605,592,557};
      int ypoints[]={239,242,248,250,248,246,243,239};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //15
    {
      g.setColor(new Color(127,127,125));
      int xpoints[]={545,580,578,547,545};
      int ypoints[]={235,242,247,239,235};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //16
    {
      g.setColor(new Color(154,166,178));
      int xpoints[]={357,389,428,455,451,452,419,380,357};
      int ypoints[]={191,195,197,208,208,208,203,196,191};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //17
    {
      g.setColor(new Color(26,42,58));
      int xpoints[]={438,436,455,500,500,496,438};
      int ypoints[]={193,200,208,206,203,207,193};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //18
    {
      g.setColor(new Color(98,103,107));
      int xpoints[]={362,370,371,373,418,416,381,379,377,376,376,362};
      int ypoints[]={218,217,216,203,213,232,222,222,222,224,223,218};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //19
    {
      g.setColor(new Color(58,68,75));
      int xpoints[]={369,372,408,419,418,386,372,368,369};
      int ypoints[]={202,200,201,209,214,207,204,203,202};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //20
    {
      g.setColor(new Color(118,126,125));
      int xpoints[]={376,385,386,375,373,376};
      int ypoints[]={224,226,223,220,222,224};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //21
    {
      g.setColor(new Color(157,162,158));
      int xpoints[]={374,376,371,367,363,363,363,372,374};
      int ypoints[]={204,208,217,218,218,213,205,203,204};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //22
    {
      g.setColor(new Color(108,108,108));
      int xpoints[]={362,361,369,372,371,362,362};
      int ypoints[]={214,206,200,204,207,212,214};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //23
    {
      g.setColor(new Color(74,74,89));
      int xpoints[]={364,364,369,368,362,362,364};
      int ypoints[]={217,211,210,208,211,217,217};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //24
    {
      g.setColor(new Color(71,86,109));
      int xpoints[]={290,275,271,269,281,281,290};
      int ypoints[]={184,179,179,179,183,182,184};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //25
    {
      g.setColor(new Color(68,81,98));
      int xpoints[]={274,310,360,378,384,326,283,274};
      int ypoints[]={179,178,182,191,195,186,182,179};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //26
    {
      g.setColor(new Color(188,197,206));
      int xpoints[]={275,311,357,337,273,275};
      int ypoints[]={179,179,182,176,179,179};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //27
    {
      g.setColor(new Color(72,87,110));
      int xpoints[]={362,360,379,404,415,417,420,420,427,438,436,390,368,362};
      int ypoints[]={184,182,184,189,192,187,189,191,191,193,200,197,189,184};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //28
    {
      g.setColor(new Color(26,42,58));
      int xpoints[]={510,509,540,541,510};
      int ypoints[]={196,198,204,202,196};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //29
    {
      g.setColor(new Color(38,66,72));
      int xpoints[]={563,570,571,564,563};
      int ypoints[]={203,204,198,196,203};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //30
    {
      g.setColor(new Color(110,135,146));
      int xpoints[]={564,563,560,561,564};
      int ypoints[]={196,203,202,195,196};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //31
    {
      g.setColor(new Color(70,74,79));
      int xpoints[]={564,547,547,509,418,417,456,456,541,564};
      int ypoints[]={210,213,214,236,209,202,209,208,205,210};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //32
    {
      g.setColor(new Color(168,168,168));
      int xpoints[]={530,530,525,525,530};
      int ypoints[]={210,212,212,210,210};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //33
    {
      g.setColor(new Color(29,37,39));
      int xpoints[]={446,444,441,482,482,461};
      int ypoints[]={232,225,221,234,241,239};
      g.fillPolygon(xpoints,ypoints,xpoints.length);
    }
    //LINES
    
    {
      g.setColor(Color.BLACK);
      int xpoints[]={526,525,524};
      int ypoints[]={239,248,251};
      g.drawPolyline(xpoints,ypoints,xpoints.length);
    }
    g.drawLine(530,259,547,262);
    g.drawLine(556,232,570,236);
    g.drawLine(554,220,572,226);
    //Complete Outline
    {
      g.setColor(Color.BLACK);
      int xpoints[]={492,497,500,500,538,539,509,510,540,543,573,597,572,572,585,585,588,588,585,585,566,572,579,592,605,604,593,586,585,582,568,569,565,565,553,553,546,545,529,527,519,517,517,494,490,490,476,461,462,460,410,410,433,429,422,424,416,415,411,380,383,383,376,373,374,362,363,363,362,362,361,362,320,291,280,269,271,274,273,337,338,354,370,394,417,417,420,420,427,438,437,438,492};
      int ypoints[]={206,205,203,205,204,204,198,196,202,199,180,187,225,226,230,232,232,234,234,240,236,240,241,243,246,248,250,248,257,263,263,263,263,263,272,273,274,274,270,262,263,269,270,269,252,252,249,256,258,259,248,246,250,246,242,237,234,239,242,235,229,226,224,222,222,218,218,217,217,211,206,205,196,187,183,179,179,179,179,176,177,171,172,177,189,187,189,191,191,193,194,193,206};
      g.drawPolygon(xpoints,ypoints,xpoints.length);
    }
   g.setColor(Color.WHITE);
    g.setFont(new Font("Algerian",Font.PLAIN,38));
    g.drawString("JF-17 THUNDER",310,380);
         g.setColor(Color.BLACK);
    g.setFont(new Font("Arial", Font.BOLD, 35));
    g.drawString("NOTE:",30,580);
    int yl=610;
    for(int i=0;i<3;i++){
      g.drawLine(30,yl,650,yl);
      yl+=30;
    }


    //MONTH NAME
    {
      int yax=170;
      g.setColor(new Color(242,108,79));
      g.setFont(new Font("Algerian", Font.PLAIN,40));
      for(int l=0;l<strMonth.length();++l){
      g.drawString(""+Character.toUpperCase(strMonth.charAt(l)),635,yax);
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
    g.drawImage(image, 510, 440, 120, 120, this);
  }
    }
  }
}