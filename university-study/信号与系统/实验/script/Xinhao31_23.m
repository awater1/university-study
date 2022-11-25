clc;
n=-pi:2:pi;
Y=0.5*(1+cos(n));
syms x w   ;           
f=@(x) sin(pi*x)/(x*(1-x^2));
X=0;
for k = -3:3
    X = X + 0.5*f(w+pi*k);
end
fw=abs(X);

subplot(211),
stem(n,Y);  
grid on
xlabel('t'),ylabel('f(t)')
title('²¨ÐÎ');

subplot(212),
fplot(fw,[-20,20]),grid on
axis([-6 6 -0.2 2])
xlabel('w'),ylabel('f(w)')
title('·ù¶ÈÆ×');
