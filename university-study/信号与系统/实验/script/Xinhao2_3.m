t=-8:0.01:8; % time vector; unit: second
y_t = cos(pi*t)+cos(2*pi*t); % function vector
figure; plot(t,y_t); % show the figure
axis([min(t) max(t) -1.2 2]) % limit the axis
title('y(t) signal'); 
xlabel('t [s]');
ylabel('y(t)');