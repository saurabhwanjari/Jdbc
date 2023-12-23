
$(document).ready(function()
{
	$("#save_data").click(function() 
		{

			$.ajax({
					url: "Index.jsp",
					type: "post",
					data: {
					fname:$('#fname').val(),
					id:$('#id').val(),
					},
					success : function(data)
								{
									alert("success");
									
									$('#regForm').trigger("reset");
								}
							
							});
			
			});
	
});
