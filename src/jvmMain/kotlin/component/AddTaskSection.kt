package component

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun AddTaskSectionPreview() {
    MaterialTheme {
        AddTaskSection()
    }
}

@Composable fun AddTaskSection() {
    Surface(
        shape = RoundedCornerShape(8.dp),
        color = MaterialTheme.colors.surface,
        elevation = 4.dp,
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            TextField(value = "hello world", onValueChange = {})

            Spacer(modifier = Modifier.width(16.dp))

            Button(onClick = {}) {
                Text(text = "Add")
            }
        }
    }
}
