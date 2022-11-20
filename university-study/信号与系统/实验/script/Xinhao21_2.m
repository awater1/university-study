syms t w   ;           
f = 1/(1 + w^2)   ;    
g = ifourier(f,t)  ; 

fplot(g,[-6,6]) ;  
grid on  ; % ¼ÓÍø¸ñ
xlabel('t/s')  ;
ylabel('g(t)') ;
title('²¨ÐÎÍ¼');

