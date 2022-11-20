syms t w   ;             % 定义变量
f = exp(-t).*heaviside(t)   ;     % 定义初始信号    
fw = fourier(f,t,w)  ; 
subplot(211),
fplot(abs(fw),[-6,6]) ;  
grid on  ; % 加网格
xlabel('t/s')  ;
ylabel('f(t)') ;
title('幅度谱');

phase = atan(imag(fw)/real(fw));
subplot(212),ezplot(phase);grid on,title('相位谱')

