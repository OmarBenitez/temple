// Plugin para Calcular el numero de items de una lista del Menu Lateral
// $.fn se usa cuando se quiere crear una funcion que modifique elementos del DOM
(function($) {
    $.fn.CalculaItemsLista = function(list) {
        this.each(function() {
            //$(this).addClass('ejemplo');
            var numero_elementos = list.find("li").size();

            if (numero_elementos === 0) {
                list.closest("li").hide();
            }

            $(this).html(numero_elementos);
        });
    };
})(jQuery);


$(document).ready(function() {

//----------------------- SCRIPT PARA DRAG AND DROP ------------------------//

    Dropzone.options.formCargarDocumentos = {
        acceptedFiles: '.xls'
    };

    $("#btn-up-files").click(function() {
        for (i = 0; i < xhrArr.length; i++) {
            xhrArr[i].send(formDataArr[i]);
        }
        if (Dropzone.instances.length > 0) {
            myDrop = Dropzone.instances[0];
            myDrop.on("queuecomplete", function() {
                alert('ok!!!')
            });
        }
    });
//----------------------- SCRIPT PARA ANIMACIONES ERRORES ------------------------//
     
});
