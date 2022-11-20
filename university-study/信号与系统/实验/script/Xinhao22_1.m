clc;
dt=1e-3;
t=-10:dt:10;
ft=rectpuls(0.25*t);
N=20;
k=-N:0.01:N;
[W,T] = meshgrid(k,t);
fw=dt*ft*exp(-1i*T.*W);
phase = angle(fw); 
fw=abs(fw);

subplot(311),
plot(t,ft),grid on
axis([-6 6 0 2])
xlabel('w'),ylabel('f(w)')
title('波形');
subplot(312),
plot(w,fw),grid on
axis([-20 20 0 5])
xlabel('w'),ylabel('f(w)')
title('幅度谱（数值计算）');
subplot(313),
plot(w,phase),
axis([-20 20 -5 5 ])
grid on,
title('相位谱 （数值计算）');