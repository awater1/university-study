clc;
dt=1e-3;
t=-10:dt:10;
ft=0.5*(1+cos(t));
syms x w   ;           
f=@(x) sin(pi*x)/(x*(1-x^2));
fw=abs(f(w));

subplot(211),
plot(t,ft),grid on
axis([-pi pi 0 1])
xlabel('w'),ylabel('f(w)')
title('²¨ÐÎ');
subplot(212),
fplot(fw),grid on
axis([-pi pi -0.2 3.5])
xlabel('w'),ylabel('f(w)')
title('·ù¶ÈÆ×');
