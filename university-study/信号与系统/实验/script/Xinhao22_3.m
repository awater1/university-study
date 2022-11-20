clc;
dt=1e-3;
t=-10:dt:10;
ft=tripuls(0.25*t);
ft1=tripuls(0.25*(t-0.1));
ft2=tripuls(0.25*(t-1)); 
N=20;
k=-N:0.01:N;
[W,T] = meshgrid(k,t);
fw=dt*ft*exp(-1i*T.*W);
fw1=dt*ft1*exp(-1i*T.*W);
fw2=dt*ft2*exp(-1i*T.*W);
phase = angle(fw);
phase1 = angle(fw1);
phase2 = angle(fw2);
fw=abs(fw);
fw1=abs(fw1);
fw2=abs(fw2);

subplot(311),
plot(t,ft,t,ft1,t,ft2,'.-'),legend('x(t)','x(t-0.1)','x(t-1)')
grid on
xlabel('w'),ylabel('f(w)')
title('波形');
subplot(312),
plot(w,fw,w,fw1,w,fw2,'.-'),legend('x(t)','x(t-0.1)','x(t-1)')
grid on
xlabel('w'),ylabel('f(w)')
title('幅度谱（数值计算）');
subplot(313),
plot(w,phase,w,phase1,w,phase2,'.-'),legend('x(t)','x(t-0.1)','x(t-1)')
axis([-10 10 -5 5 ])
grid on,
title('相位谱 （数值计算）');