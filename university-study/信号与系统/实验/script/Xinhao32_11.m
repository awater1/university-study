clc;
syms x   ;           
f=@(x) 0.5*(1+cos(x));
X1=0;X2=0;X3=0;
n1=-pi:0.5:pi;
n2=-pi:1:pi;
n3=-pi:2:pi;

for k = -100:100
    X1 = X1+(1.2/pi)*f(0.5*k).*sinc(2.4*(n1-0.5*k));
    X2 = X2+(2.4/pi)*f(k).*sinc(2.4*(n2-k));
    X3 = X3+(4.8/pi)*f(2*k).*sinc(2.4*(n3-2*k));
end

subplot(311),
Y=0.5*(1+cos(n1));
stem(n1,Y,'-*b');
hold on
stem(n1,X1,'-or');
hold on
plot(n1,abs(Y-X1),'-*r');
grid on
axis([-pi pi -0.1 1.1])
legend('原信号','重建信号','绝对值差值')
xlabel('t'),ylabel('f(t)')
title('T=0.5');

subplot(312),
Y=0.5*(1+cos(n2));
stem(n2,Y,'-*b');
hold on
stem(n2,X2,'-or');
hold on
plot(n2,abs(Y-X2),'-*r');
grid on
axis([-pi pi -0.1 1.1])
legend('原信号','重建信号','绝对值差值')
xlabel('t'),ylabel('f(t)')
title('T=1');

subplot(313),
Y=0.5*(1+cos(n3));
stem(n3,Y,'-*b');
hold on
stem(n3,X3,'-or');
hold on
plot(n3,abs(Y-X3),'-*r');
grid on
axis([-pi pi -0.1 1.1])
legend('原信号','重建信号','绝对值差值')
xlabel('t'),ylabel('f(t)')
title('T=2');