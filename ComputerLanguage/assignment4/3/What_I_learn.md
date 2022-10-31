### s.substring(1) >> index1부터 마지막까지 문자열을 잘라서 return
### s.substring(a,b) >> a번째부터 b번째 '전'까지 잘라서 return 

### 문제에서   String first = s.substring(0,1);
#### String first = s.substring(0,1); > index0부터 0까지 즉 맨 앞의 요소        
#### String last = s.substring(1); > index1부터 마지막까지
#### s= last+first; > 1부터 마지막까지 + 맨 앞 > 문제가 의도하는 바를 해결해낼 수 있음 
