dt=0.01;
t=-6:dt:6;
ft=exp(-t).*heaviside(t);
N=2000;
k=-N:N;
w=1*k/(N*dt);
fw=dt*ft*exp(-1i*t'*w);
phase = angle(fw); 
fw=abs(fw);
subplot(211),
plot(w,fw),grid on
axis([-6 6 0 1])
xlabel('w'),ylabel('f(w)')
title('幅度谱（数值计算）');

subplot(212),
syms t1 w   ;             % 定义变量
f = exp(-t1).*heaviside(t1)   ;     % 定义初始信号    
fw1 = fourier(f,t1,w)  ; 
fplot(abs(fw1),[-6,6]) ;  
grid on  ; % 加网格
axis([-6 6 0 1])
xlabel('t/s')  ;
ylabel('f(t)') ;
title('幅度谱');



