main {
  s1:int := ?T?sum(-10,20);
  s2:float := ?T?sum(10.0,-20.0);
  b:bool;

  if (T < F || T = F) then
     b  :=  s1 + s2 / (s1 + s2) <= 30;
  fi

  return;
};

fdef sum(i:int, j:int) {
     return i + j;
} : int;

fdef sum(i:float, j:float) {
     return i + j;
} : float;



