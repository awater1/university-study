clc;
dt=1e-3;
t=-10:dt:10;
ft=rectpuls(0.25*t);
ft1=rectpuls(0.25*t).*cos(20*t);
N=20;
k=-N:0.01:N;
[W,T] = meshgrid(k,t);
fw=dt*ft*exp(-1i*T.*W);
fw1=dt*ft1*exp(-1i*T.*W);
phase = angle(fw);
phase1 = angle(fw1);
fw=abs(fw);
fw1=abs(fw1);

subplot(311),
plot(t,ft,t,ft1,'.-'),legend('x(t)','x(t)*cos(20t)')
grid on
axis([-6 6 0 1.5])
xlabel('w'),ylabel('f(w)')
title('波形');
subplot(312),
plot(w,fw,w,fw1,'.-'),legend('x(t)','x(t)*cos(20t)')
grid on
xlabel('w'),ylabel('f(w)')
title('幅度谱（数值计算）');
subplot(313),
plot(w,phase,w,phase1,'.-'),legend('x(t)','x(t)*cos(20t)')
grid on,
title('相位谱 （数值计算）');