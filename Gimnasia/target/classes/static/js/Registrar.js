
        function sonIguales(){
            contra=document.f1.contra.value
            confirmContra=document.f1.confirmContra.value
            if(contra!=confirmContra){
                event.preventDefault();
                swal({
                    title: "Los campos contraseña y confirmar contraseña no coinciden",
                    timer: 6000
                });
            }
        }
        function submit() {
              return confirm('Subir datos del formulario?');
        }
      /* function validar(){
            nombre=document.getElementById("nombre").value;
            email=document.getElementById("email").value;
            contra=document.getElementById("contra").value;
            confirmContra=document.getElementById("confirmContra").value;
            var reg =/^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;

            if(nombre.length!=0 && email.length!=0 && contra.length!=0 && confirmContra.length!=0 && contra==confirmContra){
                if(reg.test(email)){
                     event.preventDefault();
                     swal({title: "Registro completado", timer: 6000});
                     console.log("Despues de la alerta ");
                    return true;
               }
            }
            else return false;
        }*/


