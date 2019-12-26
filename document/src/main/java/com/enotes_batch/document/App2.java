package com.enotes_batch.document;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App2 
{
    public static void main( String[] args ) throws Exception
    {
    	String s="# XB.payment.hix.mainBodySpanish=Member ID - -->member_id<--<br><br>You are receiving this e-mail to confirm that on -->trandate<--, we processed your online payment in the amount of -->tranamount<--. <br><br>Please log in to <a href=\"https://kp.org/premiumbill <https://kp.org/premiumbill/> \">https://kp.org/premiumbill <https://kp.org/premiumbill/> </a> to view your payment summary.<br><br>If you have any questions, please call us:<br><br>In CA call- 800-464-4000<br>In Denver/Boulder call- 303-338-3800<br>In Northern CO call- 844-201-5824<br>In Southern CO call- 888-681-7878<br>In Georgia call- 888-865-5813<br>In Hawaii call- 800-966-5955<br>In Oahu call- 808-432-5955<br>In Portland area call- 503-813-2000<br>In other Northwest areas call- 800-813-2000<br>In Washington DC call- 301-468-6000<br>Outside Washington DC area call- 800-777-7902<br><br>If you have a hearing or speech impairment, please call us at 711.<br><br>Thank you for choosing Kaiser Permanente.<br><br><b>No Cost Language Services</b>. You can get an interpreter. You can get documents read to you and some sent to you in your language. For help, call us at 1-800-464-4000.<br><br><b>Servicios de idiomas sin costo</b>. Puede obtener un int&eacute;rprete. Le pueden leer documentos y que le env&iacute;en algunos en espa&ntilde;ol. Para obtener ayuda, ll&aacute;menos al 1-800-464-4000.";
    	Scanner sc=new Scanner(s);
    	sc.useDelimiter("-->");
    	ArrayList<String> al=new ArrayList<String>();
    		
    	while(sc.hasNext())
    	{
    		al.add(sc.next());
    	}
    	al.stream()
		.forEach(sa->System.out.println(sa));
    	Pattern p=Pattern.compile("<--");
    	for(int i=0;i<al.size();i++)
    	{
    	Matcher m=p.matcher(al.get(i));
    	while(m.find())
    		System.out.println(al.get(i).substring(0, m.start()));
    	}
    }
}
