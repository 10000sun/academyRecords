var map_function = function(){
    var key = {deptno:30}
    var value={
        empno:this.empno,
        sal:this.sal,
        comm:this.comm
        }
    emit(key, value);
    }

var reduce_function=function(key, values){
    var reduceValue={
        empno:this.empno,
        comm:this.comm,
        sal:this.sal
    }
    for(var i=0; i<values.length; i++){
        reduceValue.empno=values[i].empno;
        reduceValue.sal=values[i].sal;
        reduceValue.comm=values[i].comm;
}
    return reduceValue;
}
db.emp.mapReduce(
map_function,
reduce_function,
{
out:"emp_exam03",
)
