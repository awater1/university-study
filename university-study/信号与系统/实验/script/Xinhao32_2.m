clc;
x=-pi:pi;
Y=0.5*(1+cos(x));
xx=-pi:1:pi;
Y1=interp1(x,Y,xx,'linear');  
plot(xx,Y1,'r')  
xlabel('t'),ylabel('f(t)')
title('T=1');