~~~java
ArrayList<Integer> a = new ArrayList<Integer>();
a.add(1);
a.add(2);
a.add(3);
a.add(4);
Iterator<Integer> i = a.iterator();
while (i.hasNext()){
  int b = i.Next();
  
  if(b==3){
    i.remove();
  }
}
~~~
//결과값으로 1,2,4가 출력됨 
