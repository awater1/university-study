sys = tf(1,[1,3,2]);
t=0:0.0001:10;
e = exp(-2*t);
y = lsim(sys,e,t);
r_z_s = (exp(-t)-exp(-2*t)-t.*exp(-2*t)).*heaviside(t);

plot(t,r_z_s,t, y,'.-'),legend('理论值','实际值');
title('零状态响应');