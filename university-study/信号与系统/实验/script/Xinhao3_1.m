t=-1:0.001:2;
f1_t = exp(-2*t).*heaviside(t);
f2_t = exp(-3*t).*heaviside(t);
t3=-2 : 0.001 : 4;
f_t = (exp(-2*t3)-exp(-3*t3)).*heaviside(t3);
f3_t=conv(f1_t, f2_t);
f3_t=f3_t*0.001;

plot(t3,f_t,t3, f3_t,'.-'),legend('理论值','实际值');
title('x(t)=f_1(t)*f_2(t)');
