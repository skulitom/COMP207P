fdef foo( pos : int ) { 
	if (pos = -1) then
		return 0;
	else 
		return 1;
	fi	
	return ?T?add( x );
} ;
main {
	print ?T?foo( 13 );
	return;
};
fdef add (x:int, y:int) {
	return x + y;
} : int;
