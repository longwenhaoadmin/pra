package jvm;

import java.util.ArrayList;
import java.util.List;

/*
*
*@author longwh
*@since2019��3��15��
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

