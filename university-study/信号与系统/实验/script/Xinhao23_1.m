a=[1 1 1];
b=[0 1];
dt=0.01;
w = -10:dt:10;
h = freqs(b,a,w);
fw = abs(h);
pw = angle(h);
subplot(211), plot(w,fw), grid on
xlabel ('f (rad/s)'), ylabel('∑˘∆µ')
subplot(212), 
plot(w,pw), grid on
xlabel ('f (rad/s)'), ylabel( 'œ‡∆µ')