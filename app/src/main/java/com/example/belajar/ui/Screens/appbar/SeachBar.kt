package com.example.belajar.ui.Screens.appbar

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.isTraversalGroup
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.traversalIndex
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar() {
    var searchText by remember { mutableStateOf(TextFieldValue("")) }
    var expanded by rememberSaveable { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp)
            .semantics { isTraversalGroup = true }
    ) {
        SearchBar(
            query = searchText.text,
            onQueryChange = { searchText = TextFieldValue(it) },
            onSearch = { expanded = false },
            active = expanded,
            onActiveChange = { expanded = it },
            placeholder = { Text("Cari sesuatu...") },
            leadingIcon = { Icon(Icons.Default.Search, contentDescription = "Search") },
            trailingIcon = { Icon(Icons.Default.MoreVert, contentDescription = "More") },
            modifier = Modifier
                .align(Alignment.TopCenter)
                .semantics { traversalIndex = 0f }
                .fillMaxWidth()
                .height(34.dp),
            colors = SearchBarDefaults.colors(
                containerColor = Color(0xFFFFFFFF), // Ubah warna latar belakang
                dividerColor = Color.Transparent,
                inputFieldColors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    cursorColor = Color.Black
                )
            )
        ) {
            Column(Modifier.verticalScroll(rememberScrollState())) {
                repeat(4) { idx ->
                    val resultText = "Saran $idx"
                    ListItem(
                        headlineContent = { Text(resultText) },
                        supportingContent = { Text("Informasi tambahan") },
                        leadingContent = { Icon(Icons.Filled.Star, contentDescription = null) },
                        modifier = Modifier
                            .clickable {
                                searchText = TextFieldValue(resultText)
                                expanded = false
                            }
                            .fillMaxWidth()
                            .padding(horizontal = 25.dp, vertical = 15.dp)
                    )
                }
            }
        }

//        LazyColumn(
//            contentPadding = PaddingValues(start = 16.dp, top = 72.dp, end = 16.dp, bottom = 16.dp),
//            verticalArrangement = Arrangement.spacedBy(8.dp),
//            modifier = Modifier.semantics { traversalIndex = 1f },
//        ) {
//            val list = List(100) { "Text $it" }
//            items(list) { item ->
//                Text(
//                    text = item,
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(horizontal = 16.dp),
//                )
//            }
//        }
    }
}

@Composable
@Preview
fun SearchBarPreview() {
    SearchBar()
}