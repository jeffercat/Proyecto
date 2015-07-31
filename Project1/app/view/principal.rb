requere 'Car'
requere 'Time'
#Vista , lectura de los datos .
puts "Ingresa la placa del Vehiculo :"
STDOUT.flush
placa=gets.chomp
puts "Ingresa la Fecha: "
STDOUT.flush
fecha=gets.chomp
puts "Ingresa la Hora: "
STDOUT.flush
hora=gets.chomp
objCar = Car.new(placa)
objTime= Time.new(fecha,hora)
def validacion = (objCar,objTime):{
}

