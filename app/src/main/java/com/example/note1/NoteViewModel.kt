package com.example.note1

    import androidx.lifecycle.LiveData
    import androidx.lifecycle.MutableLiveData
    import androidx.lifecycle.ViewModel

    class NoteViewModel : ViewModel() {

        private val _nodeID = MutableLiveData<Int?>()
        val nodeID: LiveData<Int?>
            get() = _nodeID

        private val _nodeName = MutableLiveData<String?>()
        val nodeName: LiveData<String?>
            get() = _nodeName

        private val _nodeDes = MutableLiveData<String?>()
        val nodeDes: LiveData<String?>
            get() = _nodeDes

        init {

        }

        fun setNoteData(nodeID: Int, nodeName: String, nodeDes: String) {
            _nodeID.value = nodeID
            _nodeName.value = nodeName
            _nodeDes.value = nodeDes
        }


    }

