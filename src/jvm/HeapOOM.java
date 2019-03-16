package jvm;

import java.util.ArrayList;
import java.util.List;

/*
*
*@author longwh
*@since2019Äê3ÔÂ15ÈÕ
*vm:-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError -XX:+PrintGCDetails -Dfile.encoding=UTF-8
*/
public class HeapOOM{
static class OOMObject{
}
public static void main (String[]args){
	List<OOMObject> list = new ArrayList<OOMObject>();
		while(true){
			list.add(new OOMObject());
		}
	}
}

