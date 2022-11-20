close all; clc;clear all;
dt = 1e-3; %时域抽样间隔
t=-10:dt:10; %信号主要取值区间
w = -20:0.01:20; %信号频谱主要取值区间
[W,T] = meshgrid(w,t); %生成矩阵
%门信号
tao=4;
xt1 = rectpuls(t,tao);
Xjw1 = dt*xt1*exp(-1i*T.*W); %利用矩阵-向量乘法计算
%画图
subplot(3,1,1); plot(t,xt1);
title('G_{4}(t)'); xlabel('t'); ylim([-0.1 1.1])
subplot(3,1,2); plot(w,abs(Xjw1));
title('G_{4}(t)的幅度谱'); xlabel('\omega')
subplot(3,1,3); plot(w,angle(Xjw1).*(abs(Xjw1)>=1e-3));%去除数值计算带来的误差
title('G_{4}(t)的相位谱'); xlabel('\omega'); ylim([-3.2 3.2])