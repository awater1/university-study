t=-16:0.01:16; % time vector; unit: second
y_t = cos(t)+cos(0.25*pi*t); % function vector
figure; plot(t,y_t); % show the figure
axis([min(t) max(t) -1 2]) % limit the axis
title('y(t) signal'); 
xlabel('t [s]');
ylabel('y(t)');